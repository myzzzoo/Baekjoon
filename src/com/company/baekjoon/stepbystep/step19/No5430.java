package com.company.baekjoon.stepbystep.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class No5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<t; i++){
            String[] func = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            String[] arr = input.substring(1,input.length()-1).split(",");

            Deque<String> dq = new LinkedList<>();
            for(int j=0; j<arr.length; j++){
                dq.addLast(arr[j]);
            }
            boolean reverse = false;
            boolean error = false;
            for(int j=0; j<func.length; j++){
                String cmd = func[j];
                if(cmd.equals("R")){
                    reverse = !reverse;
                }
                else{
                    if(n==0){
                        error=true;
                        break;
                    }
                    if(dq.isEmpty()){
                        error = true;
                        break;
                    }
                    else{
                        if(reverse){
                            dq.removeLast();
                        }
                        else{
                            dq.removeFirst();
                        }
                    }
                }
            }
            if(error){
                sb.append("error").append("\n");
            }
            else{
                if(dq.isEmpty()){
                    sb.append("[]").append("\n");
                    continue;
                }
                if(reverse){

                    sb.append("[").append(dq.removeLast());
                    while(!dq.isEmpty()){
                        sb.append(",").append(dq.removeLast());
                    }
                    sb.append("]").append("\n");
                }
                else{
                    sb.append("[").append(dq.removeFirst());
                    while(!dq.isEmpty()){
                        sb.append(",").append(dq.removeFirst());
                    }
                    sb.append("]").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
