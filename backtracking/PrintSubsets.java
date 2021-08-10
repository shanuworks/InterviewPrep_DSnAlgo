package com.google.backtracking;
import java.util.List;
import java.util.ArrayList;

public class PrintSubsets {
    public static void main (String args[]) {
        List<Integer> currentSet = new ArrayList<Integer>();
        int arr[] = new int[]{1,2,3};
        for( int i : arr ) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("All possible subsets of above array are below : ");
        printSubsets(arr,arr.length,0, currentSet);
    }
    public static void printSubsets( int[] arr, int size, int index, List<Integer> currentSet  ) {
        // Base condition
        if( index == size ) {
            System.out.print(currentSet+"   ");
            return;
        }
        // Call for left subtree i.e. without adding the input to the answer
        printSubsets(arr,size,index+1, currentSet);

        //Add the current index input value to the current subset and call for right child
        currentSet.add(arr[index]);
        printSubsets(arr,size,index+1, currentSet);

        //Backtrack to the previous value so that next subset doesn't include currentvalue
        currentSet.remove(currentSet.size()-1);
    }
}
