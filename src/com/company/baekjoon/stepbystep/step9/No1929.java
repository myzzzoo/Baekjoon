package com.company.baekjoon.stepbystep.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=m; i<=n; i++){
            if(i==1)
                continue;
            boolean isPrime = true;
            for(int j=2; j*j<=i; j++){
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
