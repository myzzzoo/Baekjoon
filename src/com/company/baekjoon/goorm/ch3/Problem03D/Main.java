package com.company.baekjoon.goorm.ch3.Problem03D;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * 피보나치 나머지
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] Fibonacci = new int[1000000];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        for(int i=2; i<1000000; i++){
            Fibonacci[i]= (Fibonacci[i-1]+Fibonacci[i-2])%100000000;
        }
        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine())-1;
            System.out.println(Fibonacci[n]);
        }
    }


}

