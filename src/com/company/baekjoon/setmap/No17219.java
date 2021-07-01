package com.company.baekjoon.setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class No17219 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] siteInfo = br.readLine().split(" ");
        int n = Integer.parseInt(siteInfo[0]);
        int m = Integer.parseInt(siteInfo[1]);

        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String[] sitePwd = br.readLine().split(" ");
            map.put(sitePwd[0],sitePwd[1]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            String site = br.readLine();
            sb.append(map.get(site)).append('\n');
        }
        System.out.println(sb);
    }
}
