package com.company.baekjoon.stepbystep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        long[] arr = new long[101];

        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
        for(int i=6; i<101; i++){
            arr[i] = arr[i-1]+arr[i-5];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]).append("\n");
        }
        System.out.println(sb);
    }
}
