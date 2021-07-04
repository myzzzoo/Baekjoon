package com.company.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//정수 제곱근
public class No2471 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        BigInteger q = new BigInteger(n.sqrt().toString());
        if(n.compareTo(q.pow(2))>0){
            q = q.add(new BigInteger("1"));
        }
        System.out.println(q);


    }
}
