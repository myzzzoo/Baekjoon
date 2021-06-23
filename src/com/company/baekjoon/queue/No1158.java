package com.company.baekjoon.queue;
//요세푸스 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<n+1; i++){
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while(queue.size()>1){
            for(int i=0; i<k-1; i++){
                queue.add(queue.remove());
            }
            sb.append(queue.remove()).append(", ");
        }
        sb.append(queue.remove());
        System.out.println("<"+sb+">");
    }
}
