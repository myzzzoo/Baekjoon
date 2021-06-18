package com.company.baekjoon.stack;
//스택

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            if (str.contains("push")) {
                int x = Integer.parseInt(str.substring(5));
                stack.push(x);
            }
            else if (str.equals("top"))
            {
                if(stack.isEmpty())
                    sb.append("-1").append('\n');
                else
                    sb.append(stack.peek()).append('\n');
            }
            else if(str.equals("size")) {
                sb.append(stack.size()).append('\n');
            }
            else if(str.equals("empty")){
                if(stack.isEmpty())
                    sb.append("1").append('\n');
                else
                    sb.append("0").append('\n');
            }
            else{
                if(stack.isEmpty())
                    sb.append("-1").append('\n');
                else
                    sb.append(stack.pop()).append('\n');
            }
        }
        System.out.println(sb);
    }

}
