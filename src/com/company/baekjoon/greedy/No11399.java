package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//ATM
public class No11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] arr = new int[n];
        int i=0;
        for(String s:input){
            arr[i] = Integer.parseInt(s);
            i++;
        }
        Arrays.sort(arr);
        int result = 0;
        for(int j=1; j<n; j++){
            arr[j] = arr[j-1]+arr[j];
            result+=arr[j];
        }
        System.out.println(result+arr[0]);
    }
}
