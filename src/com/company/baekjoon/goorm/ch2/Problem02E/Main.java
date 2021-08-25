package com.company.baekjoon.goorm.ch2.Problem02E;

import java.io.*;
import java.lang.*;
import java.util.*;


//소수의 판별
public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 주어진 숫자가 소수인지 판별하는 함수
     *
     * @param N
     * @return true   소수라면
     * @return false  소수가 아니라면
     */
    public static boolean isPrime(int N)
    {
        if(N==1)
            return false;
        for(int i=2; i<Math.sqrt(N); i++){
            if(N%i==0)
                return false;
        }
        return true;
    }

    public static void testCase(int caseIndex)
    {
        int n = scanner.nextInt();
        boolean result = isPrime(n);

        System.out.printf("Case #%d\n", caseIndex);
        if(result)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws Exception {
        int caseSize = scanner.nextInt();

        for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
            testCase(caseIndex);
        }
    }

}

