package com.company.baekjoon.stepbystep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int cnt = 0;
        for(String s :input){
            if(!s.equals(""))
                cnt++;
        }
        System.out.println(cnt);
    }
}
