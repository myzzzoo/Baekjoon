package com.company.baekjoon.goorm.ch6.Problem06J;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * 빈도수 세기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        TreeMap<Integer,Integer> map = new TreeMap();

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            map.put(num,map.getOrDefault(num,0)+1);
            sb.append(map.size()).append(" ").append(map.get(num)+"\n");
        }
        System.out.println(sb);
    }
}
