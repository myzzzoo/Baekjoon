package com.company.baekjoon.stack;
//괄호의 값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class No2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<String> stack = new Stack<>();
        boolean fort = true;
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        if (!isBalanced(hm, s))
            System.out.println(0);

        else {
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[')
                    stack.push(c + "");
                else {
                    if (stack.isEmpty()) {
                        fort = false;
                        break;
                    } else {//c==']' or ')'

                        int result = 1;
                        if (stack.peek().equals("(")) {
                            result *= 2;
                            stack.pop();
                            stack.push(result + "");
                        } else if (stack.peek().equals("[")) {
                            result *= 3;
                            stack.pop();
                            stack.push(result + "");
                        } else {
                            result = 0;
                            while (!stack.peek().equals("(") && !stack.peek().equals("[")) {
                                result += Integer.parseInt(stack.pop());
                            }
                            if (stack.peek().equals("(")) {
                                result *= 2;
                                stack.pop();
                                stack.push(result + "");
                            } else if (stack.peek().equals("[")) {
                                result *= 3;
                                stack.pop();
                                stack.push(result + "");
                            }
                        }
                    }
                }
            }

            int result = 0;
            while (!stack.isEmpty()) {
                result += Integer.parseInt(stack.pop());
            }
            System.out.println(result);

        }
    }
    private static boolean isBalanced(HashMap<Character, Character> hm, String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(hm.containsValue(c)){// c=='(' or '['
                stack.push(c);
            }
            else if(hm.containsKey(c)){ //c==')' or ']'
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(stack.peek().equals(hm.get(c)))
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
