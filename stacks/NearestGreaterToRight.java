package com.google.stacks;

import java.util.Stack;

public class NearestGreaterToRight {
    public static void main(String args[]) {
        int arr[] = new int[]{1,1,1,1,1,8,1,1,2, 3, 2, 4};
        int res[] = nextGreater(arr);
        for( int i = 0 ; i< arr.length ; i++) {
            System.out.println("Next Greater to right of "+arr[i] +" is  : "+res[i] );
        }
    }
    public static int[] nextGreater(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        int index = arr.length - 1;
        for(int i = arr.length-1 ; i >= 0 ; i -- ) {
            if( stack.isEmpty() ) {
                res[index] = -1;
                index--;
            } else {
                while(!stack.isEmpty() && stack.peek() <= arr[i] ){
                    stack.pop();
                }
                if( stack.isEmpty() ) {
                    res[index] = -1;
                    index--;
                }
                if( !stack.isEmpty() && stack.peek() > arr[i] ) {
                    res[index] = stack.peek();
                    index--;
                }
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
