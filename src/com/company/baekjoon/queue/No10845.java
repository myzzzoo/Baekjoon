package com.company.baekjoon.queue;
//큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int back = 0;
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push":
                    back = Integer.parseInt(str[1]);
                    queue.add(back);
                    break;
                case "pop":
                    if (queue.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(queue.remove()).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if (queue.isEmpty())
                        sb.append(1).append('\n');
                    else
                        sb.append(0).append('\n');
                    break;
                case "front":
                    if (queue.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(queue.peek()).append('\n');
                    break;
                case "back":
                    if (queue.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(back).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
