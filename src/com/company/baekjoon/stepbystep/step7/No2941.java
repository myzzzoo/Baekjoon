package com.company.baekjoon.stepbystep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        input = input.replace("c=","1");
        input = input.replace("c-","1");
        input = input.replace("dz=","1");
        input = input.replace("d-","1");
        input = input.replace("lj","1");
        input = input.replace("nj","1");
        input = input.replace("s=","1");
        input = input.replace("z=","1");


        System.out.println(input.length());
    }
}
