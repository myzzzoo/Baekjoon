package com.company.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EfficientCurrency {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];

        for(int i=0; i<n; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[m+1];
        Arrays.fill(dp,10001);

        dp[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=coins[i]; j<=m; j++){
                if(dp[j-coins[i]]!=10001){
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        if(dp[m]!=10001){
            System.out.println(dp[m]);
        }
        else
            System.out.println(-1);
    }
}
