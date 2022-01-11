package com.company.baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//왕실의 나이트
public class No3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int x = input.charAt(1)-'0';
        int y = input.charAt(0)-'a'+1;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int cnt = 0;
        for(int i=0; i<8; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];
            if(nextX>=1&&nextY>=1&&nextX<=8&&nextY<=8)
                cnt++;
        }
        System.out.println(cnt);
    }
}
