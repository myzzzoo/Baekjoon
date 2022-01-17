package com.company.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowGradeOrder {
    static class Node{
        String name;
        int grade;

        public Node(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<Node> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            list.add(new Node(input[0],Integer.parseInt(input[1])));
        }
        Collections.sort(list,(a,b)->a.grade-b.grade);
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i).name).append(" ");
        }
        System.out.println(sb);
    }
}
