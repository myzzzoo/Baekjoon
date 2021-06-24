package com.company.baekjoon.queue;
//프린터 큐
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class No1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<tc; i++){
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int cnt =1;
            Queue<Integer> queue = new LinkedList<>();
            String[] docStr = br.readLine().split(" ");
            LinkedList<Integer> list = new LinkedList<>();

            for(int j=0; j<docStr.length; j++){
                queue.add(Integer.parseInt(docStr[j]));
                list.add(Integer.parseInt(docStr[j]));
            }
            Collections.sort(list,Collections.reverseOrder());

            while(!queue.isEmpty()){
                if(m==0){
                    if(queue.peek().equals(list.getFirst())) {
                        sb.append(cnt).append('\n');
                        break;
                    }
                    else{
                        queue.add(queue.remove());
                        m=queue.size()-1;
                    }
                }
                else{
                    if(queue.peek().equals(list.getFirst())){
                        m--;
                        queue.remove();
                        list.removeFirst();
                        cnt++;
                    }
                    else {
                        queue.add(queue.remove());
                        m--;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
