package com.company.baekjoon.priorityqueue;
//크리스마스 선물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

import java.util.PriorityQueue;

public class No14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            if(a==0){
                if(pq.isEmpty())
                    sb.append(-1).append('\n');
                else
                    sb.append(pq.remove()).append('\n');
            }
            else{
                for(int j=1; j<=a; j++){
                    int value = Integer.parseInt(str[j]);
                    pq.add(value);
                }
            }
        }
        System.out.println(sb);
    }
}
