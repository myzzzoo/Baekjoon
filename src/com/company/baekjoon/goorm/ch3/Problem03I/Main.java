package com.company.baekjoon.goorm.ch3.Problem03I;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 세카드
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


        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<m; i++){
            boolean possible = false;
            for(int j=0; j<n; j++){
                int x = cards[j];
                for(int k=0; k<n; k++){
                    int y = cards[k];
                    int z = targets[i]-x-y;
                    if(Arrays.binarySearch(cards,z)>=0) {
                        possible = true;
                        break;
                    }
                }
                if(possible==true)
                    break;
            }
            if(possible==true)
                result.add(targets[i]);
        }
        Collections.sort(result);
        if(result.isEmpty())
            System.out.println("NO");
        else {
            for(int i:result){
                System.out.print(i+" ");
            }
        }
    }
}
