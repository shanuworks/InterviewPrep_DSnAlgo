package com.google.oneToN;

import java.util.List;
import java.util.ArrayList;


public class MultipleMissingAndDuplicateElement {
    public static void main( String args[] ) {
        int arr[] = new int[]{ 2, 3, 6, 8, 7, 4, 5, 1};
        List<ArrayList<Integer>> res = findMissingAndDuplicate(arr, arr.length );
        System.out.print(" Missing Numbers : ");
        for( int i : res.get(0) ) {
            System.out.print(i+"  ");
        }
        System.out.println("");
        System.out.print(" Duplicate Numbers : ");
        for( int i : res.get(1) ) {
            System.out.print(i+" ");
        }

    }
    public static List<ArrayList<Integer>> findMissingAndDuplicate(int[] arr, int size) {
        List<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> missing = new ArrayList<Integer>();
        ArrayList<Integer> duplicate = new ArrayList<Integer>();

        for(int i = 0; i < size ;) {
            if( arr[i] != arr[arr[i] - 1 ] ) {
                swap(arr, i, arr[i]-1);
            } else {
                i++;
            }
        }
        int i = 0;
        while(i < size) {
            if( arr[i] != i+1 ) {
                missing.add(i+1);
                duplicate.add(arr[i]);
            }
            i++;
        }
        list.add(missing);
        list.add(duplicate);
        return list;
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
