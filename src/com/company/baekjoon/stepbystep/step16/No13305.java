package com.company.baekjoon.stepbystep.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] road = new long[n-1];
        long[] city = new long[n-1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++){
            road[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++){
            city[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        for(int i=1; i<n-1; i++){
            if(city[i]>city[i-1]) {
                city[i] = city[i-1];
            }
        }
        for(int i=0; i<n-1; i++){
            sum+= city[i]*road[i];
        }
        System.out.println(sum);
    }
}
