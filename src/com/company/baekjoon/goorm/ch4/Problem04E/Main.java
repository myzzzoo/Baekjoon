package com.company.baekjoon.goorm.ch4.Problem04E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소인수분해
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=0; i<tc; i++){
            System.out.println("#"+(i+1)+":");
            long n = Long.parseLong(br.readLine());

            for(long prime=2; prime*prime<=n; prime++){
                while(n%prime==0){
                    System.out.print(prime+" ");
                    n/= prime;
                }
            }
            if(n>1){
                System.out.print(n+" ");
            }
            System.out.println();

        }
    }
}
