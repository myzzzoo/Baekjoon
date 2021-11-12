package com.company.baekjoon.stepbystep.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int title = 0;
        while(n!=cnt){

            String sTitle = String.valueOf(title);
            if(sTitle.contains("666")){

                cnt++;
            }
            title++;
        }
        System.out.println(title-1);
    }
}
