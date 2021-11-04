package com.company.baekjoon.stepbystep.step6;

public class No4673 {
    static boolean[] arr = new boolean[10001];
    public static void main(String[] args) {
        for(int i=1; i<10001; i++){
            D(i);
        }
        for(int i = 1;i<10001;i++)
            if(arr[i]==false)
                System.out.println(i);

    }

    public static int D(int n){
        int next =n;
        while(n!=0){
            next+=n%10;
            n = n/10;
        }
        if(next>10000)
            return 0;
        if(arr[next]==true){
            return 0;
        }
        arr[next] = true;
        return D(next);
    }
}
