package com.company.baekjoon.stepbystep.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                sb.append(" ");
            }
            for(int j=1; j<=i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
