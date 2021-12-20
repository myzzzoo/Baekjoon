package com.company.baekjoon.stepbystep.step19;

import java.util.ArrayList;
import java.util.Scanner;

public class No1021 {
    public static void main(String [] args) {
        ArrayList<Integer> list= new ArrayList<>();
        int N, M, cnt=0, idx=0, arr[];

        Scanner scan= new Scanner(System.in);
        N= scan.nextInt();
        M= scan.nextInt();
        arr= new int[M];
        for(int i=0; i<M; i++) {
            arr[i]=scan.nextInt();
        }

        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        while(M>0) {
            while(true) {
                if(list.get(0)==arr[idx]) {
                    list.remove(0);
                    break;
                }
                if(list.indexOf(arr[idx])<=list.size()/2) {
                    list.add(list.size()-1,list.remove(0));
                }else {
                    list.add(0, list.remove(list.size()-1));
                }
                cnt++;
            }
            idx++;
            M--;
        }//while
        System.out.println(cnt);
    }

}
