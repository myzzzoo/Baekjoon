package com.company.baekjoon.goorm.ch5.Problem05E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 숫자 채우기1
 */
public class Main {

    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[n][n];

            int x = 0;
            int y = 0;
            int idx = 0;

            for(int j=1; j<=n*n; j++){
                map[x][y] = j;

                int nextX = x+dx[idx];
                int nextY = y+dy[idx];
                if(nextX<0||nextY<0||nextX>=n||nextY>=n||map[nextX][nextY]!=0) {
                    idx = (idx + 1) % 4;
                }
                x+=dx[idx];
                y+=dy[idx];

            }
            for(int k=0; k<n; k++){
                for(int l=0; l<n; l++){
                    System.out.print(map[k][l]+" ");
                }
                System.out.println();
            }
        }
    }


}
