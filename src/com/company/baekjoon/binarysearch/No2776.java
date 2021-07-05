package com.company.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


//암기왕
public class No2776 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> set ;

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            set = new HashSet<>();

            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            for(int j=0; j<n; j++){
                set.add(input[j]);
            }

            int m = Integer.parseInt(br.readLine());
            input = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                if(set.contains(input[j]))
                    sb.append(1).append('\n');
                else
                    sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
