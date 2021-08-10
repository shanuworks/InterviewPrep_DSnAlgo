package com.google.stacks;

import java.util.Stack;

public class MaximumAreaHistogram {
    static class Pair {
        private int nearestSmaller ;
        private int index;

        public Pair(int nearestSmaller, int index) {
            this.nearestSmaller = nearestSmaller;
            this.index = index;
        }
    }
    public static void main(String args[]) {
        int arr[] = new int[]{6,2,5,4,5,1,6};
        System.out.println("Maximum area of given histogram is  : "+findMaxArea(arr) );
    }
    public static int[] nearestSmallerToLeft(int[] arr) {
        int baseIndex = -1;
        int[] res = new int[arr.length];
        Stack<Pair> stack = new Stack<Pair>();
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++ ) {
            if( stack.isEmpty() ) {
                res[index] = baseIndex;
                index++;
            } else {
                while(!stack.isEmpty() && stack.peek().nearestSmaller >= arr[i] ){
                    stack.pop();
                }
                if( stack.isEmpty() ) {
                    res[index] = baseIndex;
                    index++;
                }
                if( !stack.isEmpty() && stack.peek().nearestSmaller < arr[i] ) {
                    res[index] = stack.peek().index;
                    index++;
                }
            }
            stack.push(new Pair(arr[i],i));
        }
        return res;
    }

    public static int[] nearestSmallerToRight(int[] arr) {
        int baseIndex = arr.length;
        int[] res = new int[arr.length];
        Stack<Pair> stack = new Stack<Pair>();
        int index =arr.length-1;
        for(int i = arr.length-1 ; i >= 0 ; i-- ) {
            if( stack.isEmpty() ) {
                res[index] = baseIndex;
                index--;
            } else {
                while(!stack.isEmpty() && stack.peek().nearestSmaller >= arr[i] ){
                    stack.pop();
                }
                if( stack.isEmpty() ) {
                    res[index] = baseIndex;
                    index--;
                }
                if( !stack.isEmpty() && stack.peek().nearestSmaller < arr[i] ) {
                    res[index] = stack.peek().index;
                    index--;
                }
            }
            stack.push(new Pair(arr[i],i));
        }
        return res;
    }

    public static int findMaxArea(int[] arr) {
        int[] left = nearestSmallerToLeft(arr);
        int[] right =nearestSmallerToRight(arr);
        for(int i : left ){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i : right ){
            System.out.print(i+" ");
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++ ) {
            int area = (right[i] -  left[i] - 1) * arr[i] ;
            if( maxArea < area )
                maxArea = area;
        }
        return maxArea;
    }
}


