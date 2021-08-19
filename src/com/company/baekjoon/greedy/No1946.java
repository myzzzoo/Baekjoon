package com.company.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//신입사원
public class No1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            HashMap<Integer,Integer> m = new HashMap<>();
            for(int j=0; j<n; j++){
                String[] s = br.readLine().split(" ");
                m.put(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            }
            int max = n;
            int topRank = m.get(1);//4
            for(int k=2; k<=n; k++){
                if(topRank<m.get(k)){
                    max--;
                }
                else{
                    topRank = m.get(k);
                }
            }
            System.out.println(max);
        }

    }
}
