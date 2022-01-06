package com.company.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            for(int j=1; j*j<=i; j++) {
                int temp = i-(j*j);
                dp[i] = Math.min(dp[i],dp[temp] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
