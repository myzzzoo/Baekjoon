package com.company.baekjoon.goorm.ch5.Problem05C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 레이저타워
 */

public class Main {
    public static final int[] px = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static final int[] py = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){

            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]); // 맵크기
            int k = Integer.parseInt(input[1]); // 후보갯수

            int[][] map = new int[n][n];
            for(int x=0; x<n; x++){
                String[] specs = br.readLine().split(" ");
                for (int y = 0; y < n; y++) {
                    map[x][y] = Integer.parseInt(specs[y]);
                }
            }

            int maxCnt =0;
            for(int j=0; j<k; j++){
                String[] points = br.readLine().split(" ");
                int x = Integer.parseInt(points[0])-1;
                int y = Integer.parseInt(points[1])-1;

                int cnt = counting(map,x,y,n);
                maxCnt = Math.max(maxCnt,cnt);
            }
            System.out.println(maxCnt);
        }
    }

    private static int counting(int[][] map, int x, int y, int n) {
        int cnt = 0;
        if(map[x][y]==1)
            cnt++;
        for(int i=0; i<8; i++){
            int nextX = x;
            int nextY = y;
            nextX +=px[i];
            nextY +=py[i];
            while (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                if(map[nextX][nextY]==1)
                    cnt++;
                nextX+=px[i];
                nextY+=py[i];
            }
        }
        return cnt;
    }
}}