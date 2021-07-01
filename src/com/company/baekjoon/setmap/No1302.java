package com.company.baekjoon.setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//베스트셀러
public class No1302 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String s = br.readLine();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq =
                new PriorityQueue<>(
                        (a,b)-> {
                            return b.getValue() - a.getValue() == 0 ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue();
                        });

        pq.addAll(map.entrySet());
        System.out.println(pq.peek().getKey());
    }
}
