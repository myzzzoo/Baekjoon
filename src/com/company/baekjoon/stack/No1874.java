package com.company.baekjoon.stack;
//스택수열
//integer 객체끼리 비교 : equals !!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class No1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            queue.add(Integer.parseInt(br.readLine()));
        }

        int cnt=1;
        while(!queue.isEmpty()){
            if(!stack.isEmpty()&&stack.peek().equals(queue.peek())){
                stack.pop();
                queue.remove();
                sb.append("-\n");
            }
            else{
                if(cnt>n)
                    break;
                stack.push(cnt);
                cnt++;
                sb.append("+\n");
            }
        }
        if(queue.isEmpty())
            System.out.println(sb);
        else
            System.out.println("NO");
    }
}
