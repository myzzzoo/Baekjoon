package com.company.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호 끼워넣기
public class No11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='(')
                stack.push(c);
            else{
                if(!stack.isEmpty()&&stack.peek()=='(')
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        System.out.println();
    }
}
