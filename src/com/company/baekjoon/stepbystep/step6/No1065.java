package com.company.baekjoon.stepbystep.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class No1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt= 0;

        for(int i=1; i<=n; i++){
            if(isHansu(i))
                cnt++;
        }
        System.out.println(cnt);

    }

    private static boolean isHansu(int i) {
        if(i<100)
            return true;
        if(i==1000)
            return false;

        int a = i%10;
        i = i/10;
        int b = i%10;
        i=i/10;
        int c = i%10;
        if(a-b == b-c)
            return true;
        else
            return false;

    }
}
