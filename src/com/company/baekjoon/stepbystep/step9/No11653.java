package com.company.baekjoon.stepbystep.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=2; i<=n; i++){
            while(n%i==0){
                sb.append(i).append("\n");
                n=n/i;
            }
        }
        System.out.println(sb);
    }
}
