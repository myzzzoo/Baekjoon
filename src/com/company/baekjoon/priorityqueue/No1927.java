package com.company.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//최소 힙
public class No1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pq.isEmpty())
                    sb.append(0).append('\n');
                else{
                    sb.append(pq.remove()).append('\n');
                }
            }
            else{
                pq.add(x);
            }
        }
        System.out.println(sb);
    }
}
