package com.company.baekjoon.stepbystep.step9;

import java.io.*;
import java.util.*;

public class No1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); //테스트케이스 갯수
        for (int a = 0; a<T; a++) {
            st = new StringTokenizer(br.readLine()," ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(circle(x1,y1,r1,x2,y2,r2))+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
    static int circle(int x1, int y1, int r1, int x2, int y2, int r2) {
        int pointToPoint= (int)(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)); //점과 점사이의 거리

        //무수히 많은 점
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        //접점이 0일때 1)원이 서로 멀리 있을때
        else if(pointToPoint > Math.pow(r1 + r2, 2)) {
            return 0;
        }
        //접점이 0일때 2)원이 원안에 있지만 접하지 않을때
        else if(pointToPoint < Math.pow(r2 - r1, 2)) {
            return 0;
        }
        //접점이 1일때 1)외접할때
        else if(pointToPoint == Math.pow(r1 + r2, 2)) {
            return 1;
        }
        //접점이 1일때 2)내접할때
        else if(pointToPoint == Math.pow(r2 - r1, 2)) {
            return 1;
        }
        else return 2; //그 외에는 접점이 모두 두개
    }
}



