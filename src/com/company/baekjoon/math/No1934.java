package com.company.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int GCD=0;
            int LCM=0;

            int small = Math.min(a,b);
            for(int j=small; j>=1; j--){
                if(a%j==0&&b%j==0) {
                    GCD = j;
                    break;
                }
            }
            LCM = GCD * (a/GCD) *(b/GCD);
            System.out.println(LCM);
        }
    }
}
