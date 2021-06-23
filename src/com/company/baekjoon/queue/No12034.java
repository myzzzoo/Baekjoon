package com.company.baekjoon.queue;
//김인천씨의 식료품가게
//딱히 큐문제는 아님
//int 값의 범위 알기!! (int a = 10^9 *3 ) 하면 초과함

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No12034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");

            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<n*2; j++){
                list.add(Integer.parseInt(s[j]));
            }
            StringBuilder sb = new StringBuilder();
            while(n>0){

                int salePrice = list.get(0);
                sb.append(" ").append(salePrice);
                list.remove(0);
                list.remove(list.indexOf((salePrice/3)*4));
                n--;
            }
            System.out.println("Case #"+(i+1)+":"+sb);
        }
    }
}
