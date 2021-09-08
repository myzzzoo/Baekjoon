package com.company.baekjoon.goorm.ch6.Problem06D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 조세퍼스 문제
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);//사람수
            int m = Integer.parseInt(input[1]);//제외간격

            Queue<Integer> q = new LinkedList<>();
            for(int j=1; j<=n; j++){
                q.add(j);
            }

            int cnt = 1;
            while(!q.isEmpty()){
                if(cnt==m){
                    System.out.print(q.remove()+" ");
                    cnt=1;
                }
                else{
                    q.add(q.remove());
                    cnt++;
                }
            }
            System.out.println();
       }
    }
}
