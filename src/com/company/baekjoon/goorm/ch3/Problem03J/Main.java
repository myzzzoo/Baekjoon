package com.company.baekjoon.goorm.ch3.Problem03J;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 네 카드
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        String[] s3 = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]); //카드 수
        int m = Integer.parseInt(s[1]); //당첨 번호 수
        int[] cards = new int[n];
        int[] targets = new int[m];

        for(int i=0; i<n; i++){
            cards[i] = Integer.parseInt(s2[i]);
        }
        for(int i=0; i<m; i++){
            targets[i] = Integer.parseInt(s3[i]);
        }
        Arrays.sort(cards);


        HashSet<Integer> pairSetCards = new HashSet<>();
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                pairSetCards.add(cards[i]+cards[j]);
            }
        }

        int[] pairCards = new int[pairSetCards.size()];
        int idx=0;
        Iterator it = pairSetCards.iterator();
        while(it.hasNext()){
            pairCards[idx]=Integer.parseInt(String.valueOf(it.next()));
            idx++;
        }
        Arrays.sort(pairCards);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<m; i++){
            boolean possible = false;
            for(int j=0; j< pairCards.length; j++){
                if(Arrays.binarySearch(pairCards,targets[i]-pairCards[j])>=0){
                    possible = true;
                    break;
                }
            }
            if(possible)
                result.add(targets[i]);
        }

        Collections.sort(result);
        if(result.isEmpty())
            System.out.println("NO");
        else{
            for(int i:result){
                System.out.print(i+" ");
            }
        }



    }
}
