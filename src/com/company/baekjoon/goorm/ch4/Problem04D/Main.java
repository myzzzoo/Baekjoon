package com.company.baekjoon.goorm.ch4.Problem04D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수열의 순환
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        long a = Integer.parseInt(input[0]);
        long lcm=0;
        for(int i=1; i<n; i++){
            long b = Integer.parseInt(input[i]);
            long numA = Math.max(a,b);
            long numB = Math.min(a,b);

            a = numA;
            b = numB;
            while(a%b!=0){
                long c = a%b;
                a = b;
                b = c;
            }
            long gcd = b; //최대공약수
            lcm = (numB/gcd)*numA; //최소공배수
            a = lcm;
        }
        System.out.println(lcm+1);
    }
}
