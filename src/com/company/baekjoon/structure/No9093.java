package com.company.baekjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String str = br.readLine();
            String[] strArr = str.split(" ");

            for(String s: strArr){
                for(int j=s.length()-1; j>=0; j--){
                    sb.append(s.charAt(j));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
