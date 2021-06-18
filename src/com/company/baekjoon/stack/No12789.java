package com.company.baekjoon.stack;

//도키도키 간식드리미

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class No12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        String[] str = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            queue.add(Integer.parseInt(str[i]));
        }

        int start = 1;
        while(!queue.isEmpty()){
            if(!stack.isEmpty()&&stack.peek()==start){
                stack.pop();
                start++;
            }
            else if(!queue.isEmpty()&&queue.peek()==start){
                queue.poll();
                start++;
            }
            else
                stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            if(stack.peek()==start){
                stack.pop();
                start++;
            }
            else
                break;
        }

        if(stack.isEmpty())
            System.out.println("Nice");
        else
            System.out.println("Sad");
    }
}
