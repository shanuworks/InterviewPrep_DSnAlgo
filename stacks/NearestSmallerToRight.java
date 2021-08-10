package com.google.stacks;

import java.util.Stack;

public class NearestSmallerToRight{
    public static void main(String args[]) {
        int arr[] = new int[]{4,5,2,10,8};
        int res[] = nearestSmaller(arr);
        for( int i = 0 ; i< arr.length ; i++) {
            System.out.println("Nearest smaller to right of "+arr[i] +" is  : "+res[i] );
        }
    }
    public static int[] nearestSmaller(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        int index =arr.length-1;
        for(int i = arr.length-1 ; i >= 0 ; i-- ) {
            if( stack.isEmpty() ) {
                res[index] = -1;
                index--;
            } else {
                while(!stack.isEmpty() && stack.peek() >= arr[i] ){
                    stack.pop();
                }
                if( stack.isEmpty() ) {
                    res[index] = -1;
                    index--;
                }
                if( !stack.isEmpty() && stack.peek() < arr[i] ) {
                    res[index] = stack.peek();
                    index--;
                }
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
