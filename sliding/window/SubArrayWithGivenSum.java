package com.google.sliding.window;

public class SubArrayWithGivenSum {
    public static void main( String args[] ) {
        int arr[] = new int[]{-10, 0, 2, -2, -20, 10};
        int sum = -22 ;
        int[] res = findSubArrayWithGivenSum(arr, arr.length, sum );
        System.out.println(" Sum found between indexes : "+ res[0] +"  " + res[1]);
    }
    public static int[] findSubArrayWithGivenSum( int[] arr, int size, int sum) {
        int res[] = new int[2];
        int current_sum = 0;
        int i = 0;
        int j = 0;
        while( j < size ) {
            current_sum = current_sum + arr[j];
            if( current_sum < sum )
                j++;
            else if( current_sum == sum) {
                res[0] = i;
                res[1] = j;
                return res;
            } else if( current_sum > sum ) {
                while( current_sum!= 0 && current_sum > sum ) {
                    current_sum = current_sum - arr[i];
                    i++;
                }
                if( current_sum == sum) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
                j++;
            }
        }
        return res;
    }
}
