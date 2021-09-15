package com.company.baekjoon.goorm.ch8.Problem08D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 그래프의 최단경로
 */
public class Main {
    public static void main(String[] args)throws IOException{
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
        System.out.println(bfs(graph,visited,start,end,n,0));
    }

    private static int bfs(int[][] graph, boolean[] visited, int start, int end, int n ,int depth) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start,depth));
        visited[start] = true;

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(int i=1; i<n+1; i++){
                if(graph[cur.value][i]==0)
                    continue;
                if(visited[i]==true)
                    continue;
                if(i==end){
                    return cur.depth+1;
                }
                queue.add(new Node(i,cur.depth+1));
                visited[i]=true;
            }
        }
        return 0;
    }
    static class Node{
        int value;
        int depth;

        public Node(int value, int depth) {
            this.value = value;
            this.depth = depth;
        }
    }
}
