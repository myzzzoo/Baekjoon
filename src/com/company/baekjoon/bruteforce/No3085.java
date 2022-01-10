package com.company.baekjoon.bruteforce;
import java.util.Scanner;


public class No3085 {
    static char[][]arr;
    static int max = Integer.MIN_VALUE;
    static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < N - 1 && arr[i][j] != arr[i][j + 1]) {  //가로 탐색
                    swap(i, j, i, j + 1);
                    getMax();
                    swap(i, j, i, j + 1);
                }
                if (i < N - 1 && arr[i][j] != arr[i + 1][j]) {
                    swap(i, j, i + 1, j);
                    getMax();
                    swap(i, j, i + 1, j);
                }
            }
        }

        System.out.println(max);

        sc.close();
    }

    static void swap(int x1, int y1, int x2, int y2) {
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    static void getMax() {
        for (int i = 0; i < N; i++) {  // 가로 탐색
            char color = arr[i][0];
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (color == arr[i][j]) {
                    count++;
                }
                else {
                    color = arr[i][j];
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        for (int i = 0; i < N; i++) {  // 세로 탐색
            char color = arr[0][i];
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (color == arr[j][i]) {
                    count++;
                }
                else {
                    color = arr[j][i];
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }
    }
}
