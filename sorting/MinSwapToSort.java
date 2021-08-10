package com.google.sorting;

public class MinSwapToSort {
    public static void main(String args[]) {
        int arr[] = {3,2,1};
        System.out.println("Minimum swaps required :-"+ minSwapToSort(arr, 0, arr.length-1));
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static int minSwapToSort(int []arr, int start, int end) {

        int mid , invCount = 0;
        if(start < end) {
            mid = (start + end)/2;
            invCount += minSwapToSort(arr, start, mid);
            invCount += minSwapToSort(arr, mid+1, end);
            invCount += merge(arr, start, mid, end);
        }
        return invCount;
    }
    public static int merge(int []arr, int start, int mid, int end) {
        if( arr[mid] <= arr[mid+1])
            return 0;
        int invCount = 0;
        int i = start;
        int j = mid+1;
        int index = 0;
        int temp[] = new int[end - start + 1];
        while( i <= mid && j <= end) {
            if( arr[i] <= arr[j])
                temp[index++] = arr[i++];
            else {
                invCount = invCount + mid - i + 1;
                temp[index++] = arr[j++];
            }

        }
        if( i <= mid)
            System.arraycopy(arr, i, arr, start+index, mid- i +1 );
        System.arraycopy(temp, 0, arr, start, index);
        return invCount;
    }
}
