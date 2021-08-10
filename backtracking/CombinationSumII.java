package com.google.backtracking;

import java.util.List;
import java.util.ArrayList;

public class CombinationSumII {
    public static void main (String args[]) {
        List<Integer> elements = new ArrayList<Integer>();
        int arr[] = new int[]{1,1,2,3};
        int target_sum = 3;
        for( int i : arr ) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("All possible combination sum for above array are below : ");
        printCombiSum(arr,arr.length,0, elements, target_sum, 0);
    }
    public static void printCombiSum( int[] arr, int size, int index, List<Integer> elements, int target_sum, int curr_sum  ) {
        // Base condition
        if( curr_sum == target_sum ) {
            System.out.println(elements);
            return;
        }
        if( index == size || curr_sum >  target_sum ) {
            return;
        }
        curr_sum += arr[index];
        elements.add(arr[index]);
        // Include current Index
        printCombiSum(arr,size,index+1, elements, target_sum, curr_sum );

// Backtrack to prev state
        curr_sum -= arr[index];
        elements.remove(elements.size()-1);

        //Exclude current Index
        printCombiSum(arr,size,index+1, elements, target_sum, curr_sum);
    }
}

