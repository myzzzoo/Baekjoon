package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//설탕배달
public class No2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //11
        int cnt = 0;

        while(n>=3){
            if(n%5!=0){
                n=n-3;
                cnt++;
                continue;
            }
            else{
                cnt+=n/5;
                n=0;
            }
        }
        if(n==0)
            System.out.println(cnt);
        else
            System.out.println(-1);

    }
}
