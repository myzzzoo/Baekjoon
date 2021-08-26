package com.company.baekjoon.goorm.ch3.Problem03B;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * 페인트
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]); //좌석수
        int m = Integer.parseInt(str[1]); //반복수
        int[] seat = new int[n+1];//좌석
        int[] colors = new int[100];
        for(int i=0; i<m; i++){
            String[] painting = br.readLine().split(" ");
            int left = Integer.parseInt(painting[0]);
            int right = Integer.parseInt(painting[1]);
            int color = Integer.parseInt(painting[2]);
            for(int j=left; j<=right; j++){
                seat[j]= color;
            }
        }
        for(int i=1; i<=n; i++){
            colors[seat[i]]++;
        }
        int maxColor=0;
        int minColor=n;
        for(int i=0; i<100; i++){
            if(colors[i]==0)
                continue;
            if(colors[i]>maxColor) {
                maxColor = colors[i];
            }
            if(colors[i]<minColor){
                minColor = colors[i];
            }
        }
        for(int i=0; i<100; i++){
            if(colors[i]==maxColor){
                System.out.println(i);
                break;
            }
        }
        for(int i=0; i<100; i++){
            if(colors[i]==minColor){
                System.out.println(i);
                break;
            }
        }

    }

}

