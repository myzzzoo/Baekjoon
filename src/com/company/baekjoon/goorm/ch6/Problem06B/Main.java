package com.company.baekjoon.goorm.ch6.Problem06B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 탑
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){

            while(!stack.isEmpty()){
                if(Integer.parseInt(input[stack.peek()])>Integer.parseInt(input[i])){
                    System.out.print((stack.peek()+1)+" ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.print("0 ");
            }
            stack.push(i);

        }
    }
}
