package com.company.baekjoon.stepbystep.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int b1 = Integer.parseInt(b);
        int b2 = Integer.parseInt(b.charAt(2)+"");
        int b3 = Integer.parseInt(b.charAt(1)+"");
        int b4 = Integer.parseInt(b.charAt(0)+"");
        System.out.println(a*b2);
        System.out.println(a*b3);
        System.out.println(a*b4);
        System.out.println(a*b1);
    }
}
