package com.company.baekjoon.stack;
//좋은 단어 실4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No3986 {

    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            if(isGoodWord(br.readLine()))
                answer++;
        }
        System.out.println(answer);
    }

    public static boolean isGoodWord(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray() ){
            if(stack.isEmpty())
                stack.push(c);
            else{
                if(stack.peek().equals(c))
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        return stack.isEmpty()? true: false;
    }
}
