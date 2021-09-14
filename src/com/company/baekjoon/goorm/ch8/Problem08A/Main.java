package com.company.baekjoon.goorm.ch8.Problem08A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 그래프의 탐색 1
 */
public class Main {
    public static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); //정점 수
        int m = Integer.parseInt(input[1]); //간선 수

        int[][] graph = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            String[] edge = br.readLine().split(" ");
            int x = Integer.parseInt(edge[0]);
            int y = Integer.parseInt(edge[1]);

            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        boolean[] visited = new boolean[n+1];
        for(int j=1; j<n+1; j++){
            if(visited[j]==false){
                dfs(graph,visited,j,n);
                sb= sb.deleteCharAt(sb.length()-1);
                sb.append("\n");
            }
        }
        visited = new boolean[n+1];
        for(int j=1; j<n+1; j++){
            if(visited[j]==false){
                bfs(graph,visited,j,n);
                sb= sb.deleteCharAt(sb.length()-1);
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }

    private static void dfs(int[][] graph, boolean[] visited, int i ,int n) {
        visited[i] = true;
        sb.append(i).append("-");
        for(int j=1; j<n+1; j++){
            if(graph[i][j]==0)
                continue;
            if(visited[j]==true)
                continue;

            dfs(graph,visited,j,n);
        }
    }

    private static void bfs(int[][] graph, boolean[] visited, int i, int n) {
        visited[i] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        sb.append(i).append("-");
        while(!queue.isEmpty()){
            int vertex = queue.poll();

            for(int v = 1; v<n+1; v++){
                if(graph[vertex][v]==0)
                    continue;
                if(visited[v]==true)
                    continue;
                queue.add(v);
                visited[v]=true;
                sb.append(v).append("-");
            }
        }
    }

}
