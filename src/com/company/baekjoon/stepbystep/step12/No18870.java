package com.company.baekjoon.stepbystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            input[i] = num;
            set.add(num);
        }

        Iterator it = set.iterator();
        int idx = 0;
        while(it.hasNext()){
            map.put((int)it.next(),idx++);
        }
        for(int i=0; i<n; i++){
            sb.append(map.get(input[i])).append(" ");
        }
        System.out.println(sb);

    }
}
