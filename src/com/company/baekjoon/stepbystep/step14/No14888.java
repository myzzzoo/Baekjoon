package com.company.baekjoon.stepbystep.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No14888 {
    static int[] arr;
    static int[] cal;
    static int n;
    static int maxAns = Integer.MIN_VALUE;
    static int minAns = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        cal = new int[4]; //{ + - * / }
        for(int i=0; i<4; i++){
            cal[i] = Integer.parseInt(st.nextToken());
        }
        backtracking(arr[0],1);
        System.out.println(maxAns);
        System.out.println(minAns);
    }

    private static void backtracking(int num, int idx) {
        if(idx==n){
            maxAns = Math.max(maxAns,num);
            minAns = Math.min(minAns,num);
            return;
        }

        for(int i=0; i<4; i++){
            if(cal[i]!=0){
                cal[i]--;
                switch (i){
                    case 0: backtracking(num+arr[idx],idx+1);
                    break;
                    case 1: backtracking(num-arr[idx],idx+1);
                    break;
                    case 2: backtracking(num*arr[idx],idx+1);
                    break;
                    case 3: backtracking(num/arr[idx],idx+1);
                    break;
                }
                cal[i]++;
            }
        }
    }
}
