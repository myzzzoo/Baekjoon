package com.company.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class No14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] num = new int[n];
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        int max = 1;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(num[i]>num[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                else
                    dp[i]= Math.max(dp[i],1);
                max = Math.max(max,dp[i]);
            }
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(max);
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(max<1)
                break;
            if(dp[i]==max) {
                stack.push(num[i]);
                max--;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
