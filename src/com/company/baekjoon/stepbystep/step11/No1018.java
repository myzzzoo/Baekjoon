package com.company.baekjoon.stepbystep.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1018 {
    static char[][] inputTable;

    static char[][] wChessTable = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        inputTable = new char[n][m];

        for(int i=0; i<n; i++){
            String input = br.readLine();
            inputTable[i] = input.toCharArray();
        }
        int minResult = 64;
        for(int i=0; i<=n-8; i++){
            for(int j=0; j<=m-8; j++){

                minResult = Math.min(minPainting(i,j),minResult);
            }
        }
        System.out.println(minResult);
    }

    private static int minPainting(int x, int y) {
        int min = 0;
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(inputTable[i][j]!=wChessTable[i-x][j-y]){
                    //System.out.println(inputTable[i][j]+" "+wChessTable[i-x][j-y]);
                    min++;
                }
            }
        }
        return Math.min(min,64-min);
    }
}
