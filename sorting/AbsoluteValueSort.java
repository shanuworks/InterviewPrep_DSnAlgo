package com.google.sorting;

import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;

public class AbsoluteValueSort {
    public static void main(String args[]) {
        int arr[] = {10, 5, 3, 9, 2};
        int x = 7;
        absDiffValueSort(arr, arr.length, x);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void absDiffValueSort(int arr[], int n, int x) {
        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();

        for(int i= 0; i < n; i++) {
            int absDiff = Math.abs( x - arr[i]) ;
            if(tm.containsKey(absDiff)) {
                ArrayList<Integer> al = tm.get(absDiff);
                al.add(arr[i]);
                tm.put(absDiff, al);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(arr[i]);
                tm.put(absDiff, al);
            }
        }

        // Update the values of array
        int index = 0;
        for (Map.Entry entry : tm.entrySet())
        {
            ArrayList<Integer> al = tm.get(entry.getKey());
            for (int i = 0; i < al.size(); i++)
                arr[index++] = al.get(i);
        }
    }
}
