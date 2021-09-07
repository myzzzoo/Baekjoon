package com.company.baekjoon.goorm.ch6.Problem06A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 괄호 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            String input = br.readLine();
            if(isVPS(input))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean isVPS(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()||stack.peek()==')')
                    return false;
                else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
