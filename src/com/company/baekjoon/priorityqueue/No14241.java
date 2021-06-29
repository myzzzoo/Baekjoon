package com.company.baekjoon.priorityqueue;
//슬라임 합치기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class No14241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        String[] slimes = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            pq.add(Integer.parseInt(slimes[i]));
        }
        int sum = 0;
        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            pq.add(x+y);
            sum= sum+(x*y);
        }
        System.out.println(sum);
    }
}
