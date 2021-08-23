package com.company.baekjoon.goorm.ch1;

import java.io.*;
import java.lang.*;
import java.util.*;

//합 구하기2
public class Problem01E {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 동아리 멤버들의 탑승 가능 여부를 출력하는 함수
     *
     * @param data 각 멤버들의 몸무게 data[0] ~ data[n-1]
     * @param n    멤버들의 수
     * @param p    놀이기구 탑승 가능 체중 제한
     * @param q    놀이기구 최대 하중
     */
    public static void solve(int[] data, int n, int p, int q)
    {
        int sum = 0;
        int cnt = 0;
        for(int i:data){
            if(i<=p){
                cnt++;
                sum+=i;
            }
        }

        System.out.println(cnt+" "+sum);
        if(sum>q)
            System.out.println("NO");
        else
            System.out.println("YES");

    }


    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            data[i] = scanner.nextInt();
        }

        solve(data, n, p, q);
    }
}
