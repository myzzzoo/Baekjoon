package com.company.baekjoon.stepbystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if(n==1){
            int num = Integer.parseInt(br.readLine());
            sb.append(num).append("\n").append(num).append("\n").append(num).append("\n").append(0);
        }
        else {
            int[] arr = new int[8001];

            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            double sum = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(br.readLine());
                sum += num;

                map.put(num, map.getOrDefault(num, 0) + 1);

                list.add(num);
            }

            PriorityQueue<Map.Entry<Integer, Integer>> listMap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    if (o1.getValue() - o2.getValue() == 0)
                        return o1.getKey() - o2.getKey();
                    else
                        return o2.getValue() - o1.getValue();
                }
            });
            listMap.addAll(map.entrySet());
            Collections.sort(list);
            double avg = sum / n;
            int mid = list.get(n / 2);
            Map.Entry<Integer, Integer> most1 = listMap.remove();
            Map.Entry<Integer, Integer> most2 = listMap.remove();

            int most = most1.getValue()==most2.getValue()?most2.getKey():most1.getKey();
            int range = list.get(n - 1) - list.get(0);

            sb.append(Math.round(avg)).append("\n").append(mid).append("\n").append(most).append("\n").append(range);
        }
        System.out.println(sb);
    }
}
