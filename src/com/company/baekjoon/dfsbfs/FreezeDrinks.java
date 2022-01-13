package com.company.baekjoon.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//음료수 얼려먹기
public class FreezeDrinks {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static int n = 0;
    static int m = 0;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][m];
        for(int i=0; i<n; i++){
            String input = br.readLine();
            map[i] = input.toCharArray();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]=='0'){
                    dfs(i,j,map);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    private static void dfs(int x, int y, char[][] map) {
        map[x][y] = '2';

        for(int i=0; i<4; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX<0||nextY<0||nextX>=n||nextY>=m)
                continue;
            if(map[nextX][nextY]!='0')
                continue;
            dfs(nextX,nextY,map);
        }
    }
}
