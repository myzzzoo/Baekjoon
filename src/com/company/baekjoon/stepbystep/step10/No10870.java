package com.company.baekjoon.stepbystep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(Fibonacci(n));
    }

    private static int Fibonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return Fibonacci(n-1)+ Fibonacci(n-2);

    }
}
