package com.company.baekjoon.goorm.ch5.Problem05B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 거대놀이공원
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int t=0; t<tc; t++) { //테스트케이스 반복

            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]); // 전체 크기
            int k = Integer.parseInt(input[1]); // 부분 크기
            int minTrash = Integer.MAX_VALUE;
            int[][] totalMap = new int[n][n]; //공터

            for (int i = 0; i < n; i++) { // 공터에 폐기물 세팅
                String[] trashes = br.readLine().split(" ");
                for (int j = 0; j < trashes.length; j++) {
                    totalMap[i][j] = Integer.parseInt(trashes[j]);
                }
            }
            //K*K 크기의 영역이 존재할 수 있는 모든 지점을 탐색
            for (int i = 0; i < n - k + 1; i++) {
                for (int j = 0; j < n - k + 1; j++) {
                    int cntTrash = counting(totalMap, i, j, n, k);
                    minTrash = Math.min(minTrash, cntTrash);
                }
            }
            System.out.println(minTrash);
        }
    }

    //k*k 영역에 있는 폐기물 수 계산
    private static int counting(int[][] totalMap, int x, int y, int n, int k) {
        int cnt = 0;

        for(int i=x; i<x+k; i++){
            for(int j=y; j<y+k; j++){
                if(totalMap[i][j]==1)
                    cnt++;
            }
        }
        return cnt;
    }
}

