package com.company.baekjoon.goorm.ch6.Problem06L;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 배열합치기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] input2 = br.readLine().split(" ");
        String[] input3 = br.readLine().split(" ");

        ArrayList<Integer> sumArr = new ArrayList<>();

        for(int i=0; i<n; i++){
            sumArr.add(Integer.parseInt(input2[i]));
        }
        for(int i=0; i<m; i++){
            sumArr.add(Integer.parseInt(input3[i]));
        }
        Collections.sort(sumArr);
        for(int i=0; i<n+m; i++){
            System.out.print(sumArr.get(i)+" ");
        }


    }
}
