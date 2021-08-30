package com.company.baekjoon.goorm.ch4.Problem04B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Probing
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); //행운권 수
        int m = Integer.parseInt(input[1]); //회원수
        int[] luckys = new int[n];
        for(int i=0; i<m; i++){
            int memberNum = Integer.parseInt(br.readLine());
            int luckyNum = memberNum%n;
            while(luckys[luckyNum]!=0){
                luckyNum++;
                if(luckyNum==n)
                    luckyNum=0;
            }
            luckys[luckyNum]= 1;
            System.out.println(luckyNum);
        }
    }
}
