package com.company.baekjoon.stepbystep.step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class No2667 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int cntHome;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        ArrayList<Integer> al = new ArrayList<>();
        int cntDanzi = 0;

        for(int i=0; i<n; i++){
            String input = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(input.charAt(j)+"");
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1){
                    cntHome = 0;
                    dfs(map,n,i,j);
                    cntDanzi++;
                    al.add(cntHome);

                }
            }
        }
        Collections.sort(al);
        System.out.println(cntDanzi);
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }

    private static void dfs(int[][] map, int n, int x, int y) {
        map[x][y] = -1;
        cntHome++;
        for(int i=0; i<4; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX<0||nextY<0||nextX>=n||nextY>=n)
                continue;
            if(map[nextX][nextY]!=1)
                continue;

            dfs(map,n,nextX,nextY);
        }
    }
}
