package com.company.baekjoon.queue;
//뱀
//좀 어려움

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No3190 {
    public static class Dir{
        public int sec;
        public String dir;

        public Dir(int sec, String dir) {
            this.sec = sec;
            this.dir = dir;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //배열크기
        int[][] arr = new int[n][n];

        int k = Integer.parseInt(br.readLine()); //사과갯수
        for(int i=0; i<k; i++){
            String[] locationA = br.readLine().split(" ");
            arr[Integer.parseInt(locationA[0])-1][Integer.parseInt(locationA[1])-1] = 1; //사과 1
        }

        int l = Integer.parseInt(br.readLine());
        int time = 1;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int locate = 0;
        int nextX = 0;
        int nextY = 0;
        Queue<Dir> dirQ = new LinkedList<>(); //방향전환할때 사용할 큐
        for(int i=0; i<l; i++){
            String[] turn = br.readLine().split(" ");
            int sec = Integer.parseInt(turn[0]);
            String dir = turn[1];
            dirQ.add(new Dir(sec,dir));
        }
        Queue<Point> queue = new LinkedList<>();// 꼬리자르기위한 큐
        queue.add(new Point(0,0));
        while(true) {
            if(!dirQ.isEmpty()&&time==dirQ.peek().sec+1){
                if(dirQ.peek().dir.equals("D")){
                    locate++;
                }
                else{
                    locate+=3;
                }
                locate = locate%4;
                nextX += dx[locate];
                nextY += dy[locate];
                dirQ.remove();
            }
            else {
                nextX+=dx[locate];
                nextY+=dy[locate];

            }
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {//벽일때

                break;
            }
            else if (arr[nextX][nextY] == 2){//자기몸일때

                break;
            }
            else if(arr[nextX][nextY]==1){ //사과면
                queue.add(new Point(nextX,nextY));
                arr[nextX][nextY]=2;

            }
            else{//빈칸이면
                Point p = queue.remove();
                arr[p.x][p.y]=0;
                queue.add(new Point(nextX,nextY));
                arr[nextX][nextY]=2;
            }
            time++;

        }
        System.out.println(time);
    }
}
