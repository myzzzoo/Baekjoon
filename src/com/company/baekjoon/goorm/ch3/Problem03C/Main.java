package com.company.baekjoon.goorm.ch3.Problem03C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 응모
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] serials = new int[n];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(s[i]);
            serials[i] = num;
        }
        Arrays.sort(serials);
        for(int i=0; i<n; i++){
            if(i==0){
                if(serials[i]!=serials[i+1])
                    sb.append(serials[i]).append(" ");
            }
            else if(i==n-1){
                if(serials[i]!=serials[i-1])
                    sb.append(serials[i]).append(" ");
            }
            else{
                if(serials[i]!=serials[i-1]&&serials[i]!=serials[i+1])
                    sb.append(serials[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
