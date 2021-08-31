package com.company.baekjoon.goorm.ch4.Problem04F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 소수세기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        boolean[] numbers = new boolean[1000001];

        for(int i=2; i*i<=1000000; i++){
            for(int j=i+i; j<=1000000; j=j+i){
                numbers[j] = true;
            }
        }
        numbers[1] = true;
        for(int i=0; i<tc; i++){
            int cnt = 0;
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            for(int j=start; j<=end; j++){
                if(numbers[j]==false)
                    cnt++;
            }
            System.out.println("Case #"+(i+1)+":");
            System.out.println(cnt);
        }
    }
}
