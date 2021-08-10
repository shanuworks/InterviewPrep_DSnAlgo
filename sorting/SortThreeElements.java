package com.google.sorting;
import java.util.Arrays;
public class SortThreeElements {
    public static void main(String args[]) {
        int arr[] = new int[] {2,1,0,1,0,0,1,2,1,2};
        sortElements(arr,  arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void sortElements(int arr[], int n) {
        int temp[] = new int[3];
        for(int i=0; i< n ;i++) {
            if(arr[i] == 0)
                temp[0]++;
            else if(arr[i] == 1)
                temp[1]++;
            else if(arr[i] == 2)
                temp[2]++;
        }
        Arrays.fill( arr, 0, temp[0], 0);
        Arrays.fill(arr, temp[0],temp[0]+temp[1],1);
        Arrays.fill(arr,temp[0]+temp[1], n ,2);

    }
}
