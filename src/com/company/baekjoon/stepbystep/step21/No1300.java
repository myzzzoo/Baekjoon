package com.company.baekjoon.stepbystep.step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1300 {
    public static void main(String [] args) throws IOException {
        int N, K;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N= Integer.parseInt(br.readLine());
        K= Integer.parseInt(br.readLine());

        System.out.println(parametric_s(N, K));
    }

    public static long parametric_s(int N, int K) {
        long left=1, right=K, mid, cnt;

        while(left<=right) {
            cnt=0;
            mid=(left+right)/2;

            //조건
            for(int i=1; i<=N; i++) {
                cnt+= Math.min(mid/i, N);
            }

            if(K<=cnt) {
                right= mid-1;
            }else { //cnt<K
                left= mid+1;
            }
        }
        return left;
    }
}
