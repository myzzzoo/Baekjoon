package com.company.baekjoon.stepbystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class No3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<10; i++){
            set.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(set.size());
    }
}
