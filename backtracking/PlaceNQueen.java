package com.google.backtracking;

import java.util.List;
import java.util.ArrayList;

public class PlaceNQueen {
    public static void main (String args[]) {
        List<Integer> arrangements = new ArrayList<Integer>();
        int n = 5;
        int board[][] = new int[n][n];
        System.out.println("All possible ways to place the queens are below : ");
        placeQueen(board,n,0,arrangements);
    }
    public static void placeQueen( int[][] board, int size,int col, List<Integer> arrangements) {
        // Base condition
        if( col == size ) {
            System.out.println("Board after placing the "+size+" Queen");
            for( int i=0; i<size;i++){
                for(int j=0; j < size ; j++) {
                    System.out.print(board[i][j]+"  ");
                }
                System.out.println("");
            }
            System.out.println("Arrangement : "+arrangements);
            return;
        }
        for( int i =0; i < size ; i++) {
            if(isPlaceSafe(board,size,i,col)) {
                board[i][col] = 1;
                arrangements.add(i+1);
                placeQueen( board, size, col+1 , arrangements);
                board[i][col] = 0; // Backtrack to prev state
                arrangements.remove(Integer.valueOf(i+1));// Backtrack to prev state
            }
        }
    }
    public static boolean isPlaceSafe(int[][] board, int size, int i, int j) {
        return checkIfRowSafe(board, size, i , j) &&
                checkIfUpperDiagSafe(board, size, i , j) &&
                checkIfLowerDiagSafe(board, size, i , j);
    }
    public static boolean checkIfRowSafe(int[][] board, int size, int i, int j) {
        for( int k=0 ; k < j ; k++) {
            if( board[i][k] == 1)
                return false;
        }
        return true;
    }
    public static boolean checkIfUpperDiagSafe(int[][] board, int size, int i, int j) {
        for( i=i-1,j=j-1 ; i >= 0 &&  j >= 0 ; i--,j--) {
            if( board[i][j] == 1)
                return false;
        }
        return true;
    }
    public static boolean checkIfLowerDiagSafe(int[][] board, int size, int i, int j) {
        for( i=i+1,j=j-1 ; i < size &&  j >= 0 ; i++,j--) {
            if( board[i][j] == 1)
                return false;
        }
        return true;
    }
}
