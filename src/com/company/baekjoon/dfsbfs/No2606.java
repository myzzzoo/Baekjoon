package com.company.baekjoon.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//바이러스
public class No2606 {
    static int result= 0;
    static int[][] matrix;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int m= Integer.parseInt(br.readLine());

        visited = new boolean[n+1];
        matrix = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            matrix[x][y]=1;
            matrix[y][x]=1;
        }
        dfs(1,n);
        System.out.println(result);
    }
    private static void dfs(int x, int n) {
        visited[x] = true;
        for(int i=1; i<n+1; i++){
            if(matrix[x][i]==1 && !visited[i]) {
                result++;
                dfs(i, n);
            }
        }
    }
}
