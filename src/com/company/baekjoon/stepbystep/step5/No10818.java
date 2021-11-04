package com.company.baekjoon.stepbystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int cur = Integer.parseInt(st.nextToken());
            if(cur>max){
                max = cur;
            }
            if(cur<min){
                min = cur;
            }
        }
        System.out.println(min+" "+max);
    }
}
