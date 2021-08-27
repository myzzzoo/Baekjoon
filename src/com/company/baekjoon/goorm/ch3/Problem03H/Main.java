package com.company.baekjoon.goorm.ch3.Problem03H;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *  두 카드
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        String[] s3 = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]); //카드 수
        int m = Integer.parseInt(s[1]); //당첨 번호 수
        int[] cards = new int[n];
        int[] targets = new int[m];

        for(int i=0; i<n; i++){
            cards[i] = Integer.parseInt(s2[i]);
        }

        for(int i=0; i<m; i++){
            targets[i] = Integer.parseInt(s3[i]);
        }

        Arrays.sort(cards);

        int cnt=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int flag = Arrays.binarySearch(cards,targets[i]-cards[j]);
                if(flag>=0) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
