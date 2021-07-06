package com.company.baekjoon.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//촌수계산
public class No2644 {
    static int[][] matrix;
    static boolean[] visited;
    static int n;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        matrix = new int[n+1][n+1];
        visited = new boolean[n+1];
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        result = 0;
        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            String[] relation = br.readLine().split(" ");
            int x = Integer.parseInt(relation[0]);
            int y = Integer.parseInt(relation[1]);
            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }
        dfs(start,end,0);
        if(result==0)
            System.out.println(-1);
        else
            System.out.println(result);

    }

    private static void dfs(int x, int y, int cnt) {
        visited[x] = true;
        if(x==y) {
            result = cnt;
        }
        for(int i=1; i<=n; i++){
            if(matrix[x][i]==1&& !visited[i]){
                dfs(i,y,cnt+1);
            }
        }
    }
}
