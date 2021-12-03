package com.company.baekjoon.stepbystep.step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2805 {
    static int n;
    static int m;
    static int[] trees ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        trees = new int[n];
        for(int i=0; i<n; i++){
            trees[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(trees);

        int start = 0;
        int end = trees[trees.length-1];
        int maxH = 0;

        while(start<end){
            int h = (start+end)/2;

            long sum =0;
            for(int i=0; i<n; i++){
                if(trees[i]>=h){
                    sum+=trees[i]-h;
                }
            }
            if(sum>=m){
                maxH = Math.max(maxH,h);
                start = h+1;
            }
            else{
                end = h;
            }

        }
        System.out.println(maxH);
    }

}
