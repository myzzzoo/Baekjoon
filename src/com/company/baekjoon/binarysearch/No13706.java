package com.company.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//제곱근
public class No13706 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        //System.out.println(n.sqrt());


        //이분탐색ver
        BigInteger start = new BigInteger("1");
        BigInteger mid = null;
        BigInteger end = n;

        while(start.compareTo(end)<0){
            mid = start.add(end).divide(new BigInteger("2"));
            BigInteger temp = mid.pow(2); // 제곱
            if(temp.compareTo(n)<0)
                start = mid.add(new BigInteger("1"));

            else if(temp.compareTo(n)>0)
                end = mid;
            else
                break;
        }
        System.out.println(mid);



    }
}
