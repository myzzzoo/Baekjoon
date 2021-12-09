package com.company.baekjoon.stepbystep.step22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class No1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> ascQ = new PriorityQueue<>();
        PriorityQueue<Integer> descQ = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=1; i<=n; i++){
            int num = Integer.parseInt(br.readLine());
            if(i%2==1){
                descQ.add(num);
            }
            else{
                ascQ.add(num);
            }
            if(!ascQ.isEmpty()&&!descQ.isEmpty()&&ascQ.peek()<descQ.peek()){
                int temp1 = ascQ.remove();
                int temp2 = descQ.remove();
                ascQ.add(temp2);
                descQ.add(temp1);
            }
            sb.append(descQ.peek()).append("\n");
        }
        System.out.println(sb);
    }
}
