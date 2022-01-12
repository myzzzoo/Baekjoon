package com.company.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        int targetChannel = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] brokenButton = new int[m];
        if(m>0)
            st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            brokenButton[i] = Integer.parseInt(st.nextToken());
        }

        int min = Math.abs(targetChannel-100);

        for(int i=0; i<1000000; i++){
            String s = i+"";
            if(check(m, brokenButton, s)){
                min =Math.min(s.length()+(Math.abs(i-targetChannel)),min);
            }

        }
        System.out.println(min);

    }

    private static boolean check(int m, int[] brokenButton, String s) {
        for(int j = 0; j< m; j++){
            if(s.contains(""+ brokenButton[j])){
                return false;
            }
        }
        return true;
    }
}
