package com.company.baekjoon.goorm.ch3.Problem03E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 색종이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){

            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[101][101];
            int area = 0;

            for(int j=0; j<n; j++){

                String[] s = br.readLine().split(" ");
                int y = Integer.parseInt(s[0]);
                int x = Integer.parseInt(s[1]);

                for(int k=x; k<x+10; k++){
                    for(int l=y; l<y+10; l++){
                        if(map[k][l]==0) {
                            map[k][l] = 1;
                            area++;
                        }
                    }
                }
            }
            System.out.println(area);
        }
    }
}
