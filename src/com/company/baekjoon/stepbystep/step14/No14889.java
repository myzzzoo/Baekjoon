package com.company.baekjoon.stepbystep.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No14889 {
    static int[][] stats ;
    static int n ;
    static int minResult = Integer.MAX_VALUE;
    static boolean[] isStartTeam;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        stats = new int[n][n];
        isStartTeam = new boolean[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                stats[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backTracking(0,0);
        System.out.println(minResult);
    }
    static void backTracking(int idx , int depth){
        if((n/2)==depth){

            minResult=Math.min(minStatGap(),minResult);
            if(minResult==0){
                System.out.println(minResult);
                System.exit(0);
            }
            return;
        }

        for(int i=idx; i<n; i++){
            if(isStartTeam[i]==false){
                isStartTeam[i] = true;
                backTracking(i+1, depth+1);
            }
            isStartTeam[i] = false;
        }
    }

    private static int minStatGap() {
        int aTeamStat = 0;
        int bTeamStat = 0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(isStartTeam[i]&&isStartTeam[j]){
                    aTeamStat+=stats[i][j];
                    aTeamStat+=stats[j][i];
                }
                else if(!isStartTeam[i]&&!isStartTeam[j]){
                    bTeamStat+=stats[i][j];
                    bTeamStat+=stats[j][i];
                }
            }
        }
        return Math.abs(aTeamStat-bTeamStat);

    }
}
