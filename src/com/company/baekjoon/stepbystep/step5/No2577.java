package com.company.baekjoon.stepbystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 1;
        for(int i=0; i<3; i++){
            sum *= Integer.parseInt(br.readLine());
        }
        String s = String.valueOf(sum);
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'0'] ++;
        }
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }
    }
}
