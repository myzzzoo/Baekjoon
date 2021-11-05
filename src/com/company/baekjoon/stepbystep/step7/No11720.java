package com.company.baekjoon.stepbystep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=Integer.parseInt(input.charAt(i)+"");
        }
        System.out.println(sum);
    }
}
