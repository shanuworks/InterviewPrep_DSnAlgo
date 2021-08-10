package com.google.sliding.window;

import java.util.Map;
import java.util.HashMap;

public class SubArrayWithGivenSumNegativeNum {
    public static void main( String args[] ) {
        int arr[] = new int[]{10, 2, -2, -20, 10};
        int sum = -10 ;
        int[] res = findSubArrayWithGivenSum(arr, arr.length, sum );
        System.out.println(" Sum found between indexes : "+ res[0] +"  " + res[1]);
    }
    public static int[] findSubArrayWithGivenSum( int[] arr, int size, int sum) {
        int res[] = new int[2];
        int current_sum = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for( int i = 0 ; i < size; i++) {
            current_sum = current_sum + arr[i];
            if( current_sum - sum == 0) {
                res[0] = 0;
                res[1] = i;
                return res;
            }
            if( map.containsKey(current_sum - sum )) {
                res[0] = map.get(current_sum - sum)+1;
                res[1] = i;
                return res;
            }
            map.put( current_sum, i);
        }
        return res;
    }
}
