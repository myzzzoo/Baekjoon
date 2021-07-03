package com.company.baekjoon.setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//서로 다른 부분 문자열의 개수
public class No11478 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();

        HashSet<String> set = new HashSet<>();
        for(int i=0; i<len; i++){
            for(int j=0; j<len-i; j++){
                String subStr = s.substring(i,i+j+1);
                set.add(subStr);
            }
        }
        System.out.println(set.size());
    }
}
