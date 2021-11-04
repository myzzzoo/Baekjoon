package com.company.baekjoon.stepbystep.step5;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.Comparator;
import java.util.PriorityQueue;

public class No2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PriorityQueue<Point> maxheap = new PriorityQueue<>(new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                return o2.x-o1.x;
//            }
//        });
        PriorityQueue<Point> maxheap = new PriorityQueue<>((o1,o2)->o2.x-o1.x);
        for(int i=1; i<=9; i++){
            int n = Integer.parseInt(br.readLine());
            maxheap.add(new Point(n,i));
        }
        Point p = maxheap.remove();
        System.out.println(p.x);
        System.out.println(p.y);
    }
}
