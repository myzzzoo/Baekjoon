package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//잃어버린 괄호
public class No1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] minus = s.split("-");
        int sum = 0;

        for(int i=0; i<minus.length; i++){
            String[] plus = minus[i].split("\\+");
            int subSum = 0;
            for(int j=0; j<plus.length; j++){
                int num = Integer.parseInt(plus[j]);
                subSum+=num;
            }
            if(i==0){
                sum+=subSum;
            }
            else{
                sum-=subSum;
            }
        }
        System.out.println(sum);
    }
}
