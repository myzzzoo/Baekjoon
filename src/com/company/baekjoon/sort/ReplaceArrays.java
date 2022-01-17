package com.company.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ReplaceArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            listA.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(listA);
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            listB.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(listB,Collections.reverseOrder());

        for(int i=0; i<k; i++){
            if(listA.get(i)<listB.get(i)){
                listA.remove(i);
                listA.add(i,listB.get(i));
            }
            else
                break;
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum +=listA.get(i);
        }
        System.out.println(sum);
    }
}
