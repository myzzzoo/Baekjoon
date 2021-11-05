package com.company.baekjoon.stepbystep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt =0;
        for(int i = 0; i<n; i++){
            String word = br.readLine();
            if(isGroup(word))
                cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean isGroup(String word) {
        for(int i=1; i<word.length(); i++){
            String subWord = word.substring(0,i);
            if(word.charAt(i)!=word.charAt(i-1))
                if(subWord.contains(word.charAt(i)+""))
                    return false;
        }
        return true;
    }
}
