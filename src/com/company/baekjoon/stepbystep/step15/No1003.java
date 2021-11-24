package com.company.baekjoon.stepbystep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1003 {
    static class Fibo{
        int callZero;
        int callOne;

        public Fibo(int callZero, int callOne) {
            this.callZero = callZero;
            this.callOne = callOne;
        }
    }
    static Fibo[] callNum= new Fibo[41];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        callNum[0] = new Fibo(1,0);
        callNum[1] = new Fibo(0,1);
        fibonacci(40);
        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(callNum[n].callZero+" "+callNum[n].callOne);
        }
    }

    private static void fibonacci(int n) {

        for(int i=2; i<=40; i++){
            int tempZero = callNum[i-1].callZero+callNum[i-2].callZero;
            int tempOne = callNum[i-1].callOne+callNum[i-2].callOne;
            callNum[i] = new Fibo(tempZero,tempOne);
        }

    }
}
