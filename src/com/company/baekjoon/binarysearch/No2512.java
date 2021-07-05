package com.company.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


//예산
public class No2512 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(input[i]));
        }
        Collections.sort(list);

        int start = 1;
        int end = list.get(n-1);
        int mid = 0;
        while(start<=end){
            int sum = 0;
            mid = (start+end)/2;

            for(int i=0; i<n; i++){
                if(list.get(i)<=mid)
                    sum+=list.get(i);
                else
                    sum+=mid;
            }
            if(sum>m){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(end);

    }
}
