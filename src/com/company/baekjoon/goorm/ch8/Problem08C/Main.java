package com.company.baekjoon.goorm.ch8.Problem08C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 그래프의 최장경로
 */
public class Main {
    static int maxDepth = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); //정점 수
        int m = Integer.parseInt(input[1]); //간선 수
        String[] input2 = br.readLine().split(" ");
        int start = Integer.parseInt(input2[0]);
        int end = Integer.parseInt(input2[1]);

        int[][] graph = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            String[] edge = br.readLine().split(" ");
            int x = Integer.parseInt(edge[0]);
            int y = Integer.parseInt(edge[1]);

            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        boolean[] visited = new boolean[n + 1];
        dfs(graph,visited,start,end,n,0);
        System.out.println(maxDepth);
    }

    private static void dfs(int[][] graph, boolean[] visited, int start, int end, int n, int depth) {
        if(start==end){
            maxDepth = Math.max(maxDepth,depth);
        }
        visited[start]= true;
        for(int i=1; i<n+1; i++){
            if(graph[start][i]==0)
                continue;
            if(visited[i])
                continue;
            dfs(graph,visited,i,end,n,depth+1);
            visited[i] = false;
        }
    }
}
