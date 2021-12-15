package com.company.baekjoon.stepbystep.step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1697 {
    static int[] dx = {-1,1,2};
    static int[] location= new int[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Arrays.fill(location,-1);
        System.out.println(bfs(n,k));

    }

    private static int bfs(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        location[n] = 0;
        int x = n;

        while (!q.isEmpty()&&x!=k) {
            x = q.poll();
            for(int i=0; i<3; i++){
                int nextX;
                if(i==2)
                    nextX = x*dx[i];
                else
                    nextX = x+dx[i];

                if(nextX<0||nextX>100000)
                    continue;
                if(location[nextX]!=-1)
                    continue;

                location[nextX] = location[x]+1;
                q.add(nextX);
            }
        }
        return location[x];
    }
}
