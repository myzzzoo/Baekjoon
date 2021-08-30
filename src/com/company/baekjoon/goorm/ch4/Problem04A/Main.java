package com.company.baekjoon.goorm.ch4.Problem04A;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 스도쿠 보드
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine())-1;
            int row = (n/9)+1;
            int col = n%9+1;

            int groupNum = ((row-1)/3)*3+1;
            groupNum +=(col-1)/3;

            System.out.println("Case #"+(i+1)+":");
            System.out.println(row+" "+col+" "+groupNum);
        }
    }
}
