package com.company.baekjoon.setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//평행선
public class No2358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer,Integer> mapX = new HashMap<>();
        HashMap<Integer,Integer> mapY = new HashMap<>();
        for(int i=0; i<n; i++){
            String[] pos = br.readLine().split(" ");
            int x = Integer.parseInt(pos[0]);
            int y = Integer.parseInt(pos[1]);
            mapX.put(x, mapX.getOrDefault(x,0)+1);
            mapY.put(y,mapY.getOrDefault(y,0)+1);
        }
        int cnt = 0;
        List<Integer> listX = new ArrayList<>(mapX.values());
        List<Integer> listY = new ArrayList<>(mapY.values());
        for(int x : listX){
            if(x>=2){
                cnt++;
            }
        }
        for(int y : listY){
            if(y>=2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
