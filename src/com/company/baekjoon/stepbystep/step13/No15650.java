package com.company.baekjoon.stepbystep.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15650 {
    static boolean[] visited ;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //visited = new boolean[n];
        arr = new int[m];

        dfs(1,n,m,0);
        System.out.println(sb);
    }
    public static void dfs(int cur,int n, int m, int depth){
        if(depth==m){
            for(int num:arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return ;
        }
        for(int i=cur; i<=n; i++){

            arr[depth] = i;
            dfs(i+1, n,m,depth+1);


        }
        return;
    }
}
