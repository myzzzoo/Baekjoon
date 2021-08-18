package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//수들의 합
public class No1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());

        long sum = 0;
        long cnt = 1;
        while(sum<=s){
            sum += cnt;
            cnt++;
        }
        System.out.println(cnt-2);
    }
}
