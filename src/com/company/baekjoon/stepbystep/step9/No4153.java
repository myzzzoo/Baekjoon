package com.company.baekjoon.stepbystep.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        while((input=br.readLine()).charAt(0)!='0'){
            String[] inputArr = input.split(" ");
            int[] triangle = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(triangle);

            int a = triangle[0];
            int b = triangle[1];
            int c = triangle[2];

            if(a*a+b*b ==c*c)
                sb.append("right").append("\n");
            else
                sb.append("wrong").append("\n");
        }
        System.out.println(sb);
    }
}
