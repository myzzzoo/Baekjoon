package com.company.baekjoon.stepbystep.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2580 {
    static int[][] arr = new int[9][9];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        LetsGoSudoku(0,0);
    }

    private static void LetsGoSudoku(int row, int col) {
        if(col==9){
            LetsGoSudoku(row+1,0);
            return;
        }
        if(row==9){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }
        if(arr[row][col]==0){
            for(int i=1; i<=9; i++){
                if(isPossible(row,col,i)){
                    arr[row][col] = i;
                    LetsGoSudoku(row,col+1);
                }
            }
            arr[row][col]=0;
            return;
        }
        LetsGoSudoku(row,col+1);
    }

    private static boolean isPossible(int row, int col, int num) {
        for(int i=0; i<9; i++){
            if(arr[row][i]==num){
                return false;
            }
            if(arr[i][col]==num){
                return false;
            }
        }
        int x = (row/3)*3;
        int y = (col/3)*3;
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                if(arr[i][j]==num)
                    return false;
            }
        }
        return true;
    }
}
