package com.google.stacks;

import java.util.Stack;

public class StockSpan {
    static class Pair {
        private int nearestGreater ;
        private int index;

        public Pair(int nearestGreater, int index) {
            this.nearestGreater = nearestGreater;
            this.index = index;
        }
    }
    public static void main(String args[]) {
        int arr[] = new int[]{100,80,160,170,70,60,75,85};
        int res[] = findStockSpan(arr);
        for( int i = 0 ; i< arr.length ; i++) {
            System.out.println("Stock span of "+arr[i] +" is  : "+res[i] );
        }
    }
    public static int[] findStockSpan(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Pair> stack = new Stack<Pair>();
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++ ) {
            if( stack.isEmpty() ) {
                res[index] = i +1;
                index++;
            } else {
                while(!stack.isEmpty() && stack.peek().nearestGreater <= arr[i] ){
                    stack.pop();
                }
                if( stack.isEmpty() ) {
                    res[index] = i +1;
                    index++;
                }
                if( !stack.isEmpty() && stack.peek().nearestGreater > arr[i] ) {
                    res[index] = i - stack.peek().index;
                    index++;
                }
            }
            stack.push(new Pair(arr[i], i));
        }
        return res;
    }
}

