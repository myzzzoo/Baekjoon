package com.company.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MakingTteokbokki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = arr[n-1];
        int result = 0;
        while (start <= end) {
            int mid = (start+end)/2;

            int sum = 0;
            for(int i=0; i<n; i++){
                if(mid<arr[i])
                    sum+=arr[i]-mid;
            }

            if(sum>=m){
                result = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(result);
    }
}
