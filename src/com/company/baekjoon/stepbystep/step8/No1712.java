package com.company.baekjoon.stepbystep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        if(c-b<=0)
            System.out.println(-1);
        else
            System.out.println(a/(c-b)+1);

    }
}
