package com.company.baekjoon.stepbystep.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());

        double euclidArea = r*r*Math.PI;
        double taxiArea = r*r*2;
        System.out.println(euclidArea);
        System.out.println(taxiArea);
    }
}
