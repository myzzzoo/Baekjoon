package com.company.baekjoon.stepbystep.step28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No11725 {
    static int[] parents;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        parents = new int[n+1];

        for(int i=0; i<n+1; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<n-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }

        bfs(1);
        for(int i=2; i<n+1; i++){
            sb.append(parents[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        parents[i]=-1;

        while(!q.isEmpty()){
            int parent = q.poll();
            for(int child:list.get(parent)){
                if(parents[child]!=0)
                    continue;
                parents[child]= parent;
                q.add(child);
            }
        }
    }
}
