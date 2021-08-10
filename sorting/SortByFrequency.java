package com.google.sorting;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SortByFrequency{
    public static void main(String args[]) {
        int arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        sortByFrequency(arr , arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void sortByFrequency(int arr[], int n) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for( int i = 0; i < n; i++) {
            if( map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put( arr[i] , val+1);
            } else {
                map.put( arr[i], 1);
            }
        }
        Map<Integer,Integer> map1 = sortByMapValue( map);
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : map1.entrySet()) {
            int i = entry.getValue();
            while( i > 0) {
                arr[index++] = entry.getKey();
                i--;
            }
        }
    }
    public static Map<Integer,Integer> sortByMapValue(Map<Integer,Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            list.add( entry);
        }
        Collections.sort( list, new Comparator<Map.Entry<Integer,Integer>>() {
            public int compare (Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<Integer,Integer> sortedMap = new LinkedHashMap<Integer,Integer>();
        for( Map.Entry<Integer,Integer> entry : list) {
            sortedMap.put( entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}



