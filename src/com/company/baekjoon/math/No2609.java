package com.company.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int GCD=0;
        int LCM=0;

        int small = Math.min(a,b);
        for(int i=small; i>=1; i--){
            if(a%i==0&&b%i==0) {
                GCD = i;
                break;
            }
        }
        LCM = GCD * (a/GCD) *(b/GCD);
        System.out.println(GCD);
        System.out.println(LCM);
    }
}
