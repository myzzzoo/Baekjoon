package com.company.baekjoon.stepbystep.step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<Integer,Integer> cards = new HashMap<>();
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            cards.put(num, cards.getOrDefault(num,0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            int targetNum = Integer.parseInt(st.nextToken());
            if(cards.containsKey(targetNum))
                sb.append(cards.get(targetNum)).append(" ");
            else
                sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}
