package com.company.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Node{
    char alphabet;
    int cnt;

    public Node(char alphabet, int cnt) {
        this.alphabet = alphabet;
        this.cnt = cnt;
    }
}
public class sort {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        int[] arr = new int[26];
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            arr[c-'a']++;
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.cnt-b.cnt==0?a.alphabet-b.alphabet:a.cnt-b.cnt);

        for(int i=0; i<26; i++){
            if(arr[i]!=0)
                pq.add(new Node((char) ('a'+i),arr[i]));
        }

        while(!pq.isEmpty()){
            Node Node = pq.remove();
            sb.append(Node.alphabet).append(" : ").append(Node.cnt).append("\n");
        }
        System.out.println(sb);
    }
}
