package com.company.baekjoon.goorm.ch3.Problem03F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 과유불급
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]); //카드 수
        int m = Integer.parseInt(s[1]); //팬 수
        int[] cards = new int[n]; //카드 배열
        long[] score = new long[n+1]; //점수 누적
        score[0] = 0;
        for(int i=0; i<n; i++){
            cards[i] = Integer.parseInt(s2[i]);
            score[i+1] = score[i]+cards[i];
        }

        long maxScore = Long.MIN_VALUE;
        int maxFan =0;
        for(int i=1; i<=m; i++){
            String[] s3 = br.readLine().split(" ");
            int left = Integer.parseInt(s3[0])-1;
            int right = Integer.parseInt(s3[1]);
            long sum = score[right]-score[left];

            if(maxScore<sum) {
                maxScore = sum;
                maxFan = i;
            }
        }

        System.out.println(maxFan+" "+maxScore);


    }
}
