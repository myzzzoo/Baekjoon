package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//전자레인지
public class No10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[] button = {300,60,10};
        int[] result = new int[3];

        for(int i=0; i<3; i++){
            if(t>=button[i]){
                result[i] = t/button[i];
                t = t%button[i];
            }
            else{
                continue;
            }
        }
        if(t>0)
            System.out.println(-1);
        else{
            sb.append(result[0]).append(" ").append(result[1]).append(" ").append(result[2]);
            System.out.println(sb);
        }
    }
}
