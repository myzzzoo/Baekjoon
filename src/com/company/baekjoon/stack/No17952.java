package com.company.baekjoon.stack;
//과제는 끝나지 않아

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No17952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        Stack<Integer> scores = new Stack<>();
        Stack<Integer> mins = new Stack<>();
        for(int i=0; i<n; i++){
            String str = br.readLine();

            if(str.equals("0")){
                if(!scores.isEmpty()) {
                    int min = mins.pop() - 1;
                    if (min == 0)
                        result += scores.pop();
                    else
                        mins.push(min);
                }
            }
            else{
                String[] work = str.split(" ");
                int score = Integer.parseInt(work[1]);
                int min = Integer.parseInt(work[2]);

                if(min==1){
                    result+=score;
                }
                else{
                    scores.push(score);
                    mins.push(min-1);
                }
            }
        }
        System.out.println(result);
    }
}
