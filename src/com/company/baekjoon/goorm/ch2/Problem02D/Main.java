package com.company.baekjoon.goorm.ch2.Problem02D;

import java.io.*;
import java.lang.*;
import java.util.*;

//문자열 비교
public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String s1 = scanner.next();
        String s2 = scanner.next();

        if(s1.compareTo(s2)>0)
            System.out.println(1);
        else if(s1.compareTo(s2)<0)
            System.out.println(-1);
        else
            System.out.println(0);
    }
}
