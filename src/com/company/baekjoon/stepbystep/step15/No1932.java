package com.company.baekjoon.stepbystep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1932 {
    static int[][] arr;
    static int[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n= Integer.parseInt(br.readLine());

        arr = new int[n][n];
        dp = new int[n][n];

        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<i+1; j++){
                int num = Integer.parseInt(st.nextToken());
                if(i==n-1){
                    dp[i][j] = num;
                }
                arr[i][j] = num;
            }
        }
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<i+1; j++){
                dp[i][j] = Math.max(dp[i+1][j],dp[i+1][j+1])+arr[i][j];
            }
        }
        System.out.println(dp[0][0]);
    }


}
