package com.company.baekjoon.dfsbfs;

import org.w3c.dom.Node;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//미로탈출
public class EscapeMaze {
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    static int n = 0;
    static int m = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        for(int i=0; i<n; i++){
            String input = br.readLine();
            for(int j=0; j<m; j++){
                int num = Integer.parseInt(input.charAt(j)+"");
                map[i][j] = num;
            }
        }
        bfs(0,0,map);
        System.out.println(map[n-1][m-1]);
    }

    public static void bfs(int x, int y, int[][] map) {
        // 큐(Queue) 구현을 위해 queue 라이브러리 사용
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        // 큐가 빌 때까지 반복하기
        while(!q.isEmpty()) {
            Point p  = q.poll();
            x = p.x;
            y = p.y;
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                // 벽인 경우 무시
                if (map[nx][ny] == 0) continue;
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (map[nx][ny] == 1) {
                    map[nx][ny] = map[x][y] + 1;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }
}
