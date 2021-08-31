package com.company.baekjoon.goorm.ch4.Problem04C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 최대공약수와 최소공배수
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            String[] input = br.readLine().split(" ");
            int numA = Math.max(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
            int numB = Math.min(Integer.parseInt(input[0]),Integer.parseInt(input[1]));

            long a = numA;
            long b = numB;
            while(a%b!=0){
                long c = a%b;
                a = b;
                b = c;
            }
            long gcd = b; //최대공약수
            long lcm = (numB/gcd)*numA; //최소공배수
            System.out.println("Case #"+(i+1)+":");
            System.out.println(gcd+" "+lcm);
        }
    }
}
