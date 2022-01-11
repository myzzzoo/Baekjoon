package com.company.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Earth = Integer.parseInt(st.nextToken());
        int Sun = Integer.parseInt(st.nextToken());
        int Moon = Integer.parseInt(st.nextToken());

        int i=0;

        while(true){
            int year = Sun+(28*i);
            if(year%15==Earth%15 && year%19==Moon%19){
                System.out.println(year);
                break;
            }
            i++;
        }
    }
}
