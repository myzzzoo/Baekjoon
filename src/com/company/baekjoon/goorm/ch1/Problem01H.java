package com.company.baekjoon.goorm.ch1;

import java.io.*;
import java.lang.*;
import java.util.*;

//탐색하기3
public class Problem01H {
    public static final Scanner scanner = new Scanner(System.in);


    /**
     * 평균과의 차가 가장 작은 데이터의 번호를 반환하는 함수
     * 여러 가지라면 가장 빠른 번호를 반환한다.
     *
     * @param data
     * @param n
     * @return int  가장 평균과 가까운 데이터의 번호 (1번부터 시작)
     */
    public static int findIndex(int[] data, int n)
    {
        double avg = 0;
        int resultIdx = 0;
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += (double)data[i];
        }
        avg = sum/n;
        double min = 10001;
        for(int i=0; i<n; i++){
            if(min>Math.abs(avg-(double)data[i])){
                min = Math.abs(avg-(double)data[i]);
                resultIdx = i+1;
            }
        }
        return resultIdx;
    }

    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        int answer = findIndex(data, n);
        int index = answer - 1;

        System.out.printf("%d %d\n", answer, data[index]);
    }
}
