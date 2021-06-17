package com.company.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호 실4
public class No9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String str = br.readLine();
            if(isVPS(str))
                sb.append("YES").append('\n');
            else
                sb.append("NO").append('\n');
        }
        System.out.println(sb);
    }

    private static boolean isVPS(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c=='(')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                else{
                    if(stack.peek()=='(')
                        stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
