package com.company.baekjoon.stepbystep.step16;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Point[] arr = new Point[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            arr[i] = new Point(startTime,endTime    );
        }
        Arrays.sort(arr, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.y==o2.y){
                    return o1.x-o2.x;
                }
                return o1.y-o2.y;
            }
        });

        int endTime = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[i].x>=endTime) {
                cnt++;
                endTime = arr[i].y;
            }
        }
        System.out.println(cnt);
    }
}
