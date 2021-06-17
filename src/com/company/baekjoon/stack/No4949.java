package com.company.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

//균형잡힌 세상 실4
public class No4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put(']','[');

        StringBuilder sb = new StringBuilder();
        while(true) {
            String str = br.readLine();
            if(str.equals("."))
                break;

            if(isBalanced(hm, str)){
                sb.append("yes").append('\n');
            }
            else
                sb.append("no").append('\n');
        }
        System.out.println(sb);
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
