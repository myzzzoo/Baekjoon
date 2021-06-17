package com.company.baekjoon.stack;
//고무오리 디버깅 브1


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        String curStr = br.readLine();
        curStr = br.readLine();

        while(!curStr.equals("고무오리 디버깅 끝")){
            if(curStr.equals("문제")){
                cnt++;
            }
            else{
                if(cnt==0)
                    cnt+=2;
                else
                    cnt--;
            }
            curStr = br.readLine();
        }
        if(cnt==0)
            System.out.println("고무오리야 사랑해");
        else
            System.out.println("힝구");
    }
}
