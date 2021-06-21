package com.company.baekjoon.stack;
//에디터
// 배열쓰면 시간초과남 ㅜㅜ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;


public class No1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String firstStr= br.readLine();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Character> lList = new LinkedList<>();

        for(char c : firstStr.toCharArray()){
            lList.add(c);
        }
        ListIterator<Character> iter = lList.listIterator(firstStr.length());
        for(int i=0; i<n; i++){
            String str = br.readLine();
            if(str.charAt(0)=='P'){
                iter.add(str.charAt(2));
            }
            else if(str.charAt(0)=='L'){
                if(iter.hasPrevious())
                    iter.previous();
            }
            else if(str.charAt(0)=='D'){
                if(iter.hasNext())
                    iter.next();
            }
            else{
                if(iter.hasPrevious()){
                    iter.previous();
                    iter.remove();
                }
            }
        }
        for(char c : lList){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
