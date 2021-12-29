package com.company.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/////1로 만들기
public class No1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr= new int[N+1];

        arr[1] = 0;
        if(N>1)
            arr[2] = 1;
        if(N>2)
            arr[3] = 1;

        for(int i=4; i<=N; i++){
            if(i%6==0)
                arr[i] = Math.min(Math.min(arr[i/3],arr[i/2]),arr[i-1])+1;
            else if(i%3==0)
                arr[i] = Math.min(arr[i/3],arr[i-1])+1;
            else if(i%2==0)
                arr[i] = Math.min(arr[i/2],arr[i-1])+1;
            else
                arr[i] = arr[i-1]+1;
        }

        System.out.println(arr[N]);

    }

}
