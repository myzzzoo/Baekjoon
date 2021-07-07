package com.company.baekjoon.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//연결 요소의 개수
public class No11724 {
    static int[][] matrix;
    static boolean[] visited;
    static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        matrix = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i=0; i<m; i++){
            String[] connection = br.readLine().split(" ");
            int u = Integer.parseInt(connection[0]);
            int v = Integer.parseInt(connection[1]);

            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(visited[i]==false) {
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        visited[x]=true;
        queue.add(x);

        while(!queue.isEmpty()){
            int temp = queue.remove();

            for(int i=1;i<=n;i++){
                if(visited[i]==true)
                    continue;
                if(matrix[temp][i]==0)
                    continue;
                queue.add(i);
                visited[i]=true;
            }
        }
    }
}
