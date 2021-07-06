package com.company.baekjoon.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//바닥 장식
public class No1388 {
    static int[] dx = {0,1};
    static int[] dy = {1,0};
    public static void dfs(String[][] arr, int x, int y){
        int nextX = 0;
        int nextY = 0;
        String temp = arr[x][y];
        arr[x][y] = "x";
        if(temp.equals("-")){
            nextX = x+dx[0];
            nextY = y+dy[0];
        }
        else if(temp.equals("|")){
            nextX = x+dx[1];
            nextY = y+dy[1];
        }
        if(nextX>=arr.length || nextY>= arr[0].length)
            return;
        if(temp.equals(arr[nextX][nextY])) {
            dfs(arr, nextX, nextY);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[][] arr = new String[n][m];
        for(int i=0; i<n; i++){
            arr[i] = br.readLine().split("");
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j].equals("x"))
                    continue;
                else {
                    dfs(arr, i, j);
                    System.out.println(Arrays.toString(arr[0]));
                    System.out.println(Arrays.toString(arr[1]));
                    System.out.println(Arrays.toString(arr[2]));
                    System.out.println(Arrays.toString(arr[3]));
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
