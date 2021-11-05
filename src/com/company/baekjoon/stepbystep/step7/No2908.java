package com.company.baekjoon.stepbystep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String newA = "";
        for(int i=a.length()-1; i>=0; i--) {
            newA+=a.charAt(i);
        }
        String b = st.nextToken();
        String newB = "";
        for(int i=b.length()-1; i>=0; i--) {
            newB+=b.charAt(i);
        }
        int intA = Integer.parseInt(newA);
        int intB = Integer.parseInt(newB);
        System.out.println(Math.max(intA,intB));

    }
}
