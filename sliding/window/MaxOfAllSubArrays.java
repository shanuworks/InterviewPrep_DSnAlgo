package com.google.sliding.window;

import java.util.LinkedList;

public class MaxOfAllSubArrays {
    public static void main( String args[] ) {
        int arr[] = new int[]{1, 3, 8, 10, 5, 13, 6, 7};
        int k = 3 ;
        int[] res = maxOfAllSubArrays(arr, arr.length, k );
        for( int i : res )
            System.out.print(i + " ");
    }
    public static int[] maxOfAllSubArrays( int[] arr, int size, int k) {
        int[] res = new int[size-k+1];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int i = 0;
        int j = 0;
        int index = 0;
        while( j < size ) {
            int windowSize = j-i+1 ;
            if( queue.size() == 0 ) {
                queue.add( arr[j]);
                j++;
            }
            else if( windowSize < k ) {
                while( queue.size() > 0 && queue.getLast() < arr[j] ) {
                    queue.removeLast();
                }
                queue.add(arr[j]);
                j++;
            }
            else if( windowSize == k) {
                while( queue.size() > 0 && queue.getLast() < arr[j] ) {
                    queue.removeLast();
                }
                queue.add(arr[j]);
                int max = queue.peek();
                res[index++] = max;
                if( arr[i] == max )
                    queue.remove();
                i++;
                j++;
            }
        }
        return res;
    }
}

