package com.company.baekjoon.goorm.ch1;
import java.io.*;
import java.lang.*;
import java.util.*;

//배열의 최대값
public class Problem01C {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 배열의 최대값을 계산하는 함수.
     *
     * @param data
     * @param n
     * @return data[0] ~ data[n-1]중 최대값.
     */
    public static int getMax(int[] data, int n) {
        int max = Integer.MIN_VALUE;
        for(int i: data){
            if(i>max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        int answer = getMax(data, n);

        System.out.println(answer);
    }

}
