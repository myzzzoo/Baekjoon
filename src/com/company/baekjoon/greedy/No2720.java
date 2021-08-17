package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//세탁소 사장 동혁
public class No2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine()); //124
            int[] result = new int[4]; //쿼터 , 다임 , 니켈 , 페니
            for (int j = 0; j < 4; j++) {
                sb.append(c / coins[j]).append(" ");
                c = c % coins[j];
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
