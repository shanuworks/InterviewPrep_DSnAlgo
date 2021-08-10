package com.google.sorting;

public class Sort012 {
    public static void main(String args[]) {
        int arr[] = new int[] {2,1,0,1,0,0,1,2,1,2};
        sort012(arr,  arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void sort012(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;
        while( mid <= high)
        {
            switch(arr[mid]) {
                case 0 :
                    if(arr[mid] != arr[low])
                        swap(arr,mid,low);
                    low++;
                    mid++;
                    break;
                case 1 :
                    mid++;
                    break;
                case 2 :
                    if(arr[mid] != arr[high])
                        swap(arr, mid,high);
                    high--;
                    break;
            }
        }
    }
    public static void swap(int arr[], int x, int y) {
        System.out.println("Swap called for x :"+x+" y:"+y);
        System.out.println("Swap called for val1 :"+arr[x]+" val2:"+arr[y]);
        if( x == y)
            return;
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
