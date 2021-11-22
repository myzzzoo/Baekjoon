package com.company.baekjoon.stepbystep.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9663 {
    static int n;
    static int count;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        count = 0;
        setQueen(0);
        System.out.println(count);
    }

    private static boolean setQueen(int level) {

        if(!isPossible(level))
            return false;
        if(n==level) {
            count++;
            return true;
        }
        for(int i=1; i<=n; i++){
            arr[level+1] = i;
            setQueen(level+1);
        }
        return false;
    }

    private static boolean isPossible(int level) {
        for(int i=1; i<level; i++){
            if(arr[i]==arr[level])
                return false;
        }

        for(int i=1; i<level; i++){
            if(Math.abs(arr[i]-arr[level])==level-i)
                return false;
        }

        return true;

    }
}
