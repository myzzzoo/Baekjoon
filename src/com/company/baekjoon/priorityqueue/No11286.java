package com.company.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//절대값 힙
public class No11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> {
            return (Math.abs(b)-Math.abs(a))==0 ? a-b: Math.abs(a)-Math.abs(b);
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pq.isEmpty())
                    sb.append(0).append('\n');
                else
                    sb.append(pq.remove()).append('\n');
            }
            else{
                pq.add(x);
            }
        }
        System.out.println(sb);
    }
}
