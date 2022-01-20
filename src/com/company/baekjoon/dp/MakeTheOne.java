package com.company.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeTheOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int[] dp = new int[30001];

        for(int i=2; i<=x; i++){
            if(i%5==0){
                dp[i] = Math.min(dp[i/5]+1,dp[i-1]+1);
            }
            else if(i%3==0){
                dp[i] = Math.min(dp[i/3]+1,dp[i-1]+1);
            }
            else if(i%2==0){
                dp[i] = Math.min(dp[i/2]+1,dp[i-1]+1);
            }
            else{
                dp[i] = dp[i-1]+1;
            }
        }
        System.out.println(dp[x]);
    }
}
