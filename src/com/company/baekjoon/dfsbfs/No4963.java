package com.company.baekjoon.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//섬의 개수
public class No4963 {
    static String[][] matrix;
    static boolean[][] visited;
    static int h;
    static int w;
    static int[] dx = {-1,0,1,1,1,0,-1,-1};
    static int[] dy = {-1,-1,-1,0,1,1,1,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String[] matrixSize = br.readLine().split(" ");
            w = Integer.parseInt(matrixSize[0]);
            h = Integer.parseInt(matrixSize[1]);
            if(w==0 && h==0)
                break;

            matrix= new String[h][w];
            visited = new boolean[h][w];
            for(int i=0; i<h; i++){
                String[] input = br.readLine().split(" ");
                matrix[i] = input;
            }
            int cnt = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(matrix[i][j].equals("1")&&visited[i][j]==false){
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        visited[x][y] =true;

        for(int i=0; i<8; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX<0 || nextY<0 ||
                    nextX>=h || nextY>=w)
                continue;
            if(matrix[nextX][nextY].equals("0"))
                continue;
            if(visited[nextX][nextY]==true)
                continue;

            dfs(nextX,nextY);
        }
    }
}
