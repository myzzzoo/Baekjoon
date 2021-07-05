package com.company.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//랜선자르기
public class No1654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<k; i++){
            int len = Integer.parseInt(br.readLine());
            list.add(len);
        }

        Collections.sort(list);
        long end = list.get(k-1);
        long start = 1;
        long mid = 0;
        while(start<=end){
            mid = (end+start)/2;
            long sum=0;
            for(int i=0; i<k; i++){
                sum+=list.get(i)/mid;
            }
            if(sum<n)
                end = mid-1;
            else
                start = mid+1;
        }
        System.out.println(end);
    }
}
