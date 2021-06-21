package com.company.baekjoon.stack;
//후위 표기식2
//System.out.printf("%.2f",stack.pop()); - 소수둘째자리까지
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String equa = br.readLine();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        double result = 0.00;
        Stack<Double> stack = new Stack<>();

        for(char c: equa.toCharArray()){
            if(c=='+'){
                stack.push(stack.pop()+stack.pop());
            }
            else if(c=='-'){
                double num2 = stack.pop();
                double num1 = stack.pop();
                stack.push(num1-num2);
            }
            else if(c=='*'){
                stack.push(stack.pop()*stack.pop());
            }
            else if(c=='/'){
                double num2 = stack.pop();
                double num1 = stack.pop();
                stack.push(num1/num2);
            }
            else{
                stack.push((double) arr[c-65]);
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}
