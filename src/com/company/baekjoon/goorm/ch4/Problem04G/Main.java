package com.company.baekjoon.goorm.ch4.Problem04G;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 배열 흔들기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] inputArray = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]); // 배열의 크기
        int m = Integer.parseInt(input[1]); // 처리할 명령어의 수
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        int pt = 0;
        for(int i=0; i<m; i++){
            String[] comm = br.readLine().split(" ");
            if(Integer.parseInt(comm[0])==0){
                int idxPrint = (pt+Integer.parseInt(comm[1]))%n;
                System.out.println(arr[idxPrint]);
            }
            else if(Integer.parseInt(comm[0])==1){
                int cntShift = Integer.parseInt(comm[1])%n;
                pt = (pt+cntShift)%n;

            }
            else if(Integer.parseInt(comm[0])==2){ //오른쪽 이동
                int cntShift = Integer.parseInt(comm[1])%n;
                pt = (pt-cntShift+n)%n;

            }
            else{
                pt = 0;
            }
        }
    }

}
