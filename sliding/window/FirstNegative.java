package com.google.sliding.window;

import java.util.List;
import java.util.ArrayList;

public class FirstNegative {
    public static void main( String args[] ) {
        int arr[] = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3 ;
        int[] res = findFirstNegative(arr, arr.length, k );
        for( int i : res )
            System.out.print(i + " ");
    }
    public static int[] findFirstNegative( int[] arr, int size, int k) {
        int[] res = new int[size-k+1];
        List<Integer> negativeList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int index = 0;
        while( j < size ) {
            int windowSize = j-i+1 ;
            if(arr[j] < 0){
                negativeList.add(arr[j]);
            }
            if( windowSize < k )
                j++;
            else if( windowSize == k) {
                res[index++] = negativeList.size() > 0 ? negativeList.get(0) : 0;
                if( arr[i] < 0 )
                    negativeList.remove(0);
                i++;
                j++;
            }
        }
        return res;
    }
}

