package com.company.baekjoon.setmap;

import javax.sql.rowset.BaseRowSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//대칭 차집합
public class No1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abNum = br.readLine().split(" ");

        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<2; i++){
            String[] elements = br.readLine().split(" ");
            for(int j=0; j<elements.length; j++){
                int element = Integer.parseInt(elements[j]);
                if(set.contains(element))
                    cnt++;
                else
                    set.add(element);
            }
        }
        int result = Integer.parseInt(abNum[0])+ Integer.parseInt(abNum[1])-cnt-cnt;
        System.out.println(result);
    }
}
