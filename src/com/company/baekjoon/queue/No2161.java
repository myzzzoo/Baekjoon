package com.company.baekjoon.queue;
//카드 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<n+1; i++){
            queue.add(i);
        }
        StringBuilder sb = new StringBuilder();
        while(queue.size()!=1){
            sb.append(queue.remove()).append(" ");
            queue.add(queue.remove());
        }
        sb.append(queue.remove());
        System.out.println(sb);
    }
}
