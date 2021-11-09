package com.company.baekjoon.stepbystep.step9;

import javax.management.InstanceNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        boolean[] isNotPrime = new boolean[10001];
        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine());

            for(int j=2; j*j<=n; j++){
                if(!isNotPrime[j]) {
                    for (int k = j*2; k <= n; k = k + j) {
                        isNotPrime[k] = true;
                    }
                }
            }

            for(int j=n/2; j>=2; j--){
                int a = j;
                int b = n-a;
                if(!isNotPrime[a]){
                    if(!isNotPrime[b]) {
                        System.out.println(a + " " + b);
                        break;
                    }
                }
            }
        }

    }
}
