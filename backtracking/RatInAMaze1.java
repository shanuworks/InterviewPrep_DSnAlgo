package com.google.backtracking;

public class RatInAMaze1 {
    // index change when we move up, down, left, right
    static int[] row = new int[]{-1,1,0,0};
    static int[] col = new int[]{0,0,-1,1};
    static char[] dir = new char[]{'U','D','L','R'};
    public static void main (String args[]) {
        int path[][] = new int[][] {{1,0,0},{1,1,1},{1,1,1}};
        int n = path[0].length;
        System.out.println("Paths available for rat to travel  : ");
        for( int i=0; i<n;i++){
            for(int j=0; j < n ; j++) {
                System.out.print(path[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("All possible paths from source to destination are below : ");
        if( path[0][0] == 0 || path[n-1][n-1] == 0 ) {
            System.out.println("-1");
            return;
        }
        findPath(path,n,0,0,"");
    }
    public static void findPath( int[][] arr, int size,int i,int j, String path) {
        // Base condition
        if( i == size-1 && j== size-1 ) {
            System.out.println(path);
            return;
        }
        for( int k =0; k < 4 ; k++) {
            if(isPathSafe(arr,size,i+row[k],j+col[k])) {
                arr[i][j] = 0;
                findPath( arr, size, i+row[k], j+col[k] , path+dir[k]);
                arr[i][j] = 1; // Backtrack to prev state
// no need to remove the path as it is passed by value
            }
        }
    }
    public static boolean isPathSafe(int[][] arr, int size, int i, int j) {
        if( (i >= 0 && i < size) && (j >= 0 && j < size) && arr[i][j] == 1 )
            return true;
        return false;
    }
}
