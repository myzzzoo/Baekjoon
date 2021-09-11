package com.company.baekjoon.goorm.ch7.Problem07C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 단지 번호 붙이기
 */
public class Main {
    public static final int[] dx = {1,0,-1,0};
    public static final int[] dy = {0,1,0,-1};
    public static int cntHome;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        int complex = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1&&visited[i][j]==false){
                    cntHome = 0;
                    complex++;
                    dfs(map,visited,i,j,n);
                    resultList.add(cntHome);
                }
            }
        }
        System.out.println(complex);
        Collections.sort(resultList);
        for(int i=0; i< resultList.size(); i++){
            System.out.println(resultList.get(i));
        }
    }
    public static void dfs(int[][] map, boolean[][] visited, int x, int y, int n){
        visited[x][y] = true;
        cntHome++;

        for(int i=0; i<4; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX<0||nextY<0||nextX>=n||nextY>=n)
                continue;

            if(visited[nextX][nextY]==true)
                continue;

            if(map[nextX][nextY]==0)
                continue;

            dfs(map,visited,nextX,nextY,n);
        }
    }
}
