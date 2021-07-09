package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//거스름돈
public class No5585 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n=1000-n;
        int[] coin= {500,100,50,10,5,1};
        int sum = 0;

        for(int i=0; i<6; i++){
            if(n<coin[i])
                continue;
            else{
                sum+=n/coin[i];
                n= n%coin[i];
            }
        }
        System.out.println(sum);
    }
}
