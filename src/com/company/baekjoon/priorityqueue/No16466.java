package com.company.baekjoon.priorityqueue;
//콘서트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class No16466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(String s : str){
            int num = Integer.parseInt(s);
            pq.add(num);
        }

        int curNum = pq.remove();
        if(curNum!=1)
            System.out.println(1);
        else{
            while(!pq.isEmpty()){
                if(curNum+1==pq.peek()){
                    curNum=pq.remove();
                }
                else{
                    break;
                }
            }
            System.out.println(curNum+1);
        }
    }
}
