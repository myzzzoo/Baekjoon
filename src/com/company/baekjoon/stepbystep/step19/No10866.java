package com.company.baekjoon.stepbystep.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class No10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push_front")){
                int x = Integer.parseInt(input[1]);
                dq.addFirst(x);
            }
            else if(input[0].equals("push_back")){
                int x = Integer.parseInt(input[1]);
                dq.addLast(x);
            }
            else if(input[0].equals("pop_front")){
                if(dq.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(dq.removeFirst()).append("\n");
            }
            else if(input[0].equals("pop_back")){
                if(dq.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(dq.removeLast()).append("\n");
            }
            else if(input[0].equals("size"))
                sb.append(dq.size()).append("\n");
            else if(input[0].equals("empty")){
                if(dq.isEmpty())
                    sb.append("1").append("\n");
                else
                    sb.append("0").append("\n");
            }
            else if(input[0].equals("front")){
                if(dq.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(dq.getFirst()).append("\n");
            }
            else if(input[0].equals("back")){
                if(dq.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(dq.getLast()).append("\n");
            }
        }
        System.out.println(sb);

    }
}
