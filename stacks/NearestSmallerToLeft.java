package com.google.stacks;

import java.util.Stack;

public class NearestSmallerToLeft {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 3, 2, 4};
        int res[] = nearestSmaller(arr);
        for( int i = 0 ; i< arr.length ; i++) {
            System.out.println("Nearest smaller to left of "+arr[i] +" is  : "+res[i] );
        }
    }
    public static int[] nearestSmaller(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++ ) {
            if( stack.isEmpty() ) {
                res[index] = -1;
                index++;
            } else {
                while(!stack.isEmpty() && stack.peek() >= arr[i] ){
                    stack.pop();
                }
                if( stack.isEmpty() ) {
                    res[index] = -1;
                    index++;
                }
                if( !stack.isEmpty() && stack.peek() < arr[i] ) {
                    res[index] = stack.peek();
                    index++;
                }
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
