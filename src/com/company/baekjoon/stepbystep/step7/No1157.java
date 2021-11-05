package com.company.baekjoon.stepbystep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase(Locale.ROOT);

        Map<Character,Integer> map  = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)->o2.getValue()-o1.getValue());

        if(list.size()>=2&&list.get(0).getValue().equals(list.get(1).getValue()))
            System.out.println("?");
        else{
            System.out.println(list.get(0).getKey());
        }
    }
}
