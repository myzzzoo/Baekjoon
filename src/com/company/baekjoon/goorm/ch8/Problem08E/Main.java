package com.company.baekjoon.goorm.ch8.Problem08E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 바이러스
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine()); // 목표 개체수
            System.out.println(bfs(n));
        }
    }

    private static int bfs(int n) {
        Queue<Virus> queue = new LinkedList<>();
        queue.add(new Virus(1,0));
        while (!queue.isEmpty()) {
            Virus cur = queue.poll();

            if(cur.num==n){
                return cur.time;
            }

            queue.add(new Virus(cur.num*2,cur.time+1));
            queue.add(new Virus(cur.num/3,cur.time+1));
        }
        return 0;
    }

    static class Virus{
        int num;
        int time;

        public Virus(int num, int time) {
            this.num = num;
            this.time = time;
        }
    }
}
