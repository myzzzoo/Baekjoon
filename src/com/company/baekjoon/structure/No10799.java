package com.company.baekjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] pipes = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        int cnt = 0;

        for(int i=0; i<pipes.length; i++){
            if(pipes[i]=='('){
                stack.push(pipes[i]);
                cnt++;
            }
            else{
                stack.pop();
                if(pipes[i - 1] == '(') {
                    cnt--;
                    cnt = cnt + stack.size();

                }

            }
        }
        System.out.println(cnt);
    }
}
