package com.company.baekjoon.goorm.ch6.Problem06H;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * 중복 제거하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(set.contains(num)){
                sb.append("DUPLICATED\n");
            }
            else{
                sb.append("OK\n");
                set.add(num);
            }
        }
        System.out.println(sb);
    }
}
