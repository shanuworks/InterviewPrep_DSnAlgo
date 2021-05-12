package com.google.binarySearch;

public class BinarySearchIn2D {
    public static void main(String args[]) {
        int arr[][] = new int[][]{{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        int n = 23;
        int index[] = binarySearch(arr, n);
        System.out.println("Element "+n+" found at : "+index[0]+" "+index[1]+" index");
    }
    public static int[] binarySearch(int[][] arr, int num) {
        int[] res = new int[]{-1,-1};
        int row = arr.length;
        int col = row > 0 ? arr[0].length : -1 ;
        if( num < arr[0][0])
            return res;
        if( num > arr[row-1][col-1] )
            return res;
        int i = 0;
        int j = col-1;
        while(i < row && j >= 0 ) {
            if( num == arr[i][j] ){
                res[0] = i;
                res[1] = j;
                return res;
            } else if(num < arr[i][j]){
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}



