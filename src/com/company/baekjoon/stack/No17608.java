package com.company.baekjoon.stack;
//막대기 브2


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No17608 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);

        int answer = 1;

        for(int i=0; i<n; i++){
            stack.push(Integer.parseInt(br.readLine()));
        }

        int cur = stack.peek();

        while(!stack.isEmpty()){
            if(stack.peek()<=cur){
                stack.pop();
            }
            else{
                cur = stack.pop();
                answer++;
            }
        }

        System.out.println(answer);
    }

}
