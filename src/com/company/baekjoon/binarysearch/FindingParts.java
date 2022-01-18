package com.company.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindingParts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] parts = new int[n];
        for(int i=0; i<n; i++){
            parts[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(parts);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            if(binarySearch(parts,Integer.parseInt(st.nextToken())))
                sb.append("yes").append(" ");
            else
                sb.append("no").append(" ");
        }
        System.out.println(sb);
    }
    static boolean binarySearch(int[] parts, int target){
        int start = 0;
        int end = parts.length-1;
        while(start<=end){
            int mid = (end+start)/2;
            if(parts[mid]==target)
                return true;
            else if(parts[mid]>target){
                end = mid-1;
            }
            else
                start = mid+1;
        }
        return false;
    }
}
