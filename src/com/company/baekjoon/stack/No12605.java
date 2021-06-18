package com.company.baekjoon.stack;
//단어순서 뒤집기 브1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String inputStr = br.readLine();
            String[] inputStrArray = inputStr.split(" ");

            StringBuilder result = new StringBuilder();
            result.append("Case #").append(i+1).append(":");

            for(int j=inputStrArray.length-1; j>=0; j--){
                result.append(" ").append(inputStrArray[j]);

            }
            System.out.println(result);
        }
    }
}
