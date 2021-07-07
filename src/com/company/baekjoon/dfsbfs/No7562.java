package com.company.baekjoon.dfsbfs;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//나이트의 이동
public class No7562 {
    static boolean[][] visited;
    static int[][] matrix;
    static int[] dx = {-1,-2,-2,-1,1,2,2,1};
    static int[] dy = {-2,-1,1,2,2,1,-1,-2};
    static int len;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<tc; i++){
            len = Integer.parseInt(br.readLine());
            String[] start = br.readLine().split(" ");
            String[] end = br.readLine().split(" ");

            matrix = new int[len][len];
            visited = new boolean[len][len];
            int startX = Integer.parseInt(start[0]);
            int startY = Integer.parseInt(start[1]);
            int endX = Integer.parseInt(end[0]);
            int endY = Integer.parseInt(end[1]);

            bfs(startX,startY,endX,endY);
            sb.append(matrix[endX][endY]).append('\n');
        }
        System.out.println(sb);
    }

    private static void bfs(int startX, int startY, int endX, int endY) {
        visited[startX][startY]=true;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX,startY));

        while(!queue.isEmpty()){
            Point p = queue.remove();
            if(p.x==endX&&p.y==endY)
                return;
            for(int i=0; i<8; i++){
                int nextX = p.x+dx[i];
                int nextY = p.y+dy[i];

                if(nextX<0 || nextY<0 || nextX>=len||nextY>=len)
                    continue;
                if(visited[nextX][nextY]==true)
                    continue;

                queue.add(new Point(nextX,nextY));
                matrix[nextX][nextY]=matrix[p.x][p.y]+1;
                visited[nextX][nextY]=true;
            }
        }
    }
}
