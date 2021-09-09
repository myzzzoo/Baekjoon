package com.company.baekjoon.goorm.ch6.Problem06G;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 불안정 지역
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);

            String[] input2 = br.readLine().split(" ");
            int[] incomeOfCities = new int[n];
            for(int j=0; j<n; j++){
                incomeOfCities[j] = Integer.parseInt(input2[j]);
            }

        }
    }
}
