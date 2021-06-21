package com.company.baekjoon.stack;
//압축

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No1662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<String> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();
        int result = 0;
        for(char c : str.toCharArray()){
            if(c=='('){
                stack.push("(");
            }
            else if(c==')'){
                int cnt = 0;
                while(!stack.peek().equals("(")){
                    if(stack.peek().equals("x")){
                        cnt+=count.pop();
                        stack.pop();
                    }
                    else {
                        stack.pop();
                        cnt++;
                    }
                }
                stack.pop();
                result = cnt*Integer.parseInt(stack.pop());
                stack.push("x");
                count.push(result);
            }
            else{
                stack.push(c+"");
            }
        }


        result =0;
        while(!stack.isEmpty()){
            if(stack.peek().equals("x")){
                result+=count.pop();
                stack.pop();
            }
            else {
                stack.pop();
                result++;
            }
        }
        System.out.println(result);
    }
}
