package com.company.baekjoon.stepbystep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<tc; i++){

            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String s = input[1];

            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                for(int k=0; k<r; k++){
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
