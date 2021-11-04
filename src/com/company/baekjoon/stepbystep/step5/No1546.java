package com.company.baekjoon.stepbystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        double[] arr = new double[n];
        for(int i=0; i<n; i++){
            int score = Integer.parseInt(st.nextToken());
            arr[i] = score;
            if(score>max)
                max = score;
        }
        double sum = 0;
        for(int i=0; i<n; i++){
            sum +=(arr[i]*100)/max;;
        }
        System.out.println(sum/n);
    }
}
