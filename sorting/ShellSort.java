package com.google.sorting;

public class ShellSort {
    public static void main(String args[]) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        shellSort(arr, arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void shellSort(int arr[], int n){
        for(int gap = n/2 ; gap > 0 ; gap/=2) {
            for(int i = gap; i < n ; i++) {
                int newElement = arr[i];
                int j;
                for( j= i ; j > 0 && arr[j-gap]  > newElement ; j-=gap) {
                    arr[j] = arr[j-gap];
                }
                if( j != i)
                    arr[j] = newElement ;
            }

        }
    }
}
