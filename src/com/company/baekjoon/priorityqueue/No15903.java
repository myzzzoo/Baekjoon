package com.company.baekjoon.priorityqueue;
//카드 합체 놀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class No15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        PriorityQueue<Long> pq = new PriorityQueue<>();
        String[] secondLine = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            pq.add((long) Integer.parseInt(secondLine[i]));
        }
        for(int i=0; i<m; i++){
            long x = pq.remove();
            long y = pq.remove();
            pq.add(x+y);
            pq.add(x+y);
        }
        long sum = 0;
        for(int i=0; i<n; i++){
            sum+= pq.remove();
        }
        System.out.println(sum);
    }
}
