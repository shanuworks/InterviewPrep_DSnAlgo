package com.google.sorting;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SortHashMapByValue {
    public static void main( String args[]) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(2, 2);
        hm.put(5, 2);
        hm.put(8, 3);
        hm.put(6, 1);

        Map<Integer,Integer> hm1 = sortHashMapByValue (hm);

        for( Map.Entry<Integer,Integer> entry : hm1.entrySet()) {
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }
    public static Map<Integer,Integer> sortHashMapByValue( Map<Integer,Integer> hm)
    {
        List<Map.Entry<Integer,Integer>> al = new ArrayList<>();
        for(Map.Entry entry : hm.entrySet()) {
            al.add(entry);
        }
        Collections.sort ( al , new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<Integer,Integer> newMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : al) {
            newMap.put( entry.getKey(), entry.getValue());
        }
        return newMap;
    }
}
