package com.company.baekjoon.goorm.ch7.Problem07A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 모든 조합 출력하기
 */
public class Main {
    public static final char[] ITEMS = new char[]{
            'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        combination(1,n,new ArrayList<>());
    }

    public static void combination(int depth, int limit, ArrayList<Integer> selectedIndex){
        if(depth>limit){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<selectedIndex.size(); i++){
                sb.append(ITEMS[selectedIndex.get(i)]);
            }
            System.out.println(sb);
            return;
        }

        int minIndex = 0;

        if(depth>1){
            minIndex = selectedIndex.get(selectedIndex.size()-1)+1;
        }
        for(int i=minIndex; i< ITEMS.length; i++){
            selectedIndex.add(i);
            combination(depth+1,limit,selectedIndex);
            selectedIndex.remove(selectedIndex.size()-1);
        }

    }
}
