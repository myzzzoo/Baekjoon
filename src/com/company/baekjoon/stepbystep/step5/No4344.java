package com.company.baekjoon.stepbystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            double sum = 0;
            for(int j=1; j<n+1; j++){
                sum+=Integer.parseInt(input[j]);
            }
            double avg = sum/n;
            double cnt = 0;
            for(int j=1; j<n+1; j++){
                if((double)Integer.parseInt(input[j])>avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt*100)/n);
        }
    }

}
