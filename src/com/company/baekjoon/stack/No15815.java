package com.company.baekjoon.stack;

//천재 수학자 성필

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No15815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='+'){
                stack.push(stack.pop()+stack.pop());
            }
            else if(c=='-'){
                stack.push(-1*(stack.pop()-stack.pop()));
            }
            else if(c=='*'){
                stack.push(stack.pop()*stack.pop());
            }
            else if(c=='/'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(c-'0');
            }
        }
        System.out.println(stack.pop());
    }
}
