package com.company.baekjoon.stepbystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No11651 {
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Point> pq = new PriorityQueue<>(
                (a, b)->a.y-b.y==0?a.x-b.x:a.y-b.y);
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pq.add(new Point(x,y));
        }
        while(!pq.isEmpty()){
            Point p = pq.remove();
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }
        System.out.println(sb);
    }
}
