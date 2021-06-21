package com.company.baekjoon.stack;
//앵무새

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class No14713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Stack<String>> al = new ArrayList<>();

        for(int i=0; i<n; i++){
            String[] parrot = br.readLine().split(" ");
            Stack<String> stack = new Stack<>();
            for(String s : parrot){
                stack.push(s);
            }
            al.add(stack);
        }
        String[] parrot = br.readLine().split(" ");
        Stack<String> stack = new Stack<>();
        for(String s:parrot){
            stack.push(s);
        }
        while(!stack.isEmpty()){
            boolean flag = false;
            for(int i=0; i<n; i++){
                if(!al.get(i).isEmpty()&&stack.peek().equals(al.get(i).peek())){
                    stack.pop();
                    al.get(i).pop();
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Impossible");
                break;
            }
        }
        if(stack.isEmpty())
            System.out.println("Possible");
    }
}
