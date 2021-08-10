package com.google.backtracking;

public class Sudoku1 {
    public static void main (String args[]) {
        int sudoku[][] = new int[][] {{3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}};
        if(solveSudoku(sudoku, 0,0)) {
            System.out.println("Sudoku after solving :");
            for( int i=0; i<9;i++){
                for(int j=0; j < 9 ; j++) {
                    System.out.print(sudoku[i][j]+"  ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("No solutions for the given sudoku");
        }
    }
    public static boolean solveSudoku( int[][] sudoku,int row, int col) {
        // Base condition
        if( row == 9 ) {
            return true;
        }
        if(sudoku[row][col] == 0 ) {
            for( int k = 1 ; k <= 9 ; k++ ) {
                if(isSafe(sudoku,k,row,col)) {
                    sudoku[row][col] = k;
                    if( col == 8) {
                        if(solveSudoku(sudoku, row+1, 0 ))
                            return true;
                    } else {
                        if(solveSudoku(sudoku, row, col+1 ))
                            return true;
                    }
                    sudoku[row][col] = 0; // Backtrack to prev state
                }
            }
        } else {
            if( col == 8) {
                return solveSudoku(sudoku, row+1, 0 );
            } else {
                return solveSudoku(sudoku, row, col+1 );
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sudoku, int val,int i, int j) {
        return checkRowConstraint(sudoku, val, i , j) &&
                checkColConstraint(sudoku, val, i , j) &&
                checkSubMatrixConstraint(sudoku, val, i , j);
    }
    public static boolean checkRowConstraint(int[][] sudoku, int val, int i, int j) {
        for( int k=0 ; k < 9 ; k++) {
            if( sudoku[i][k] == val)
                return false;
        }
        return true;
    }
    public static boolean checkColConstraint(int[][] sudoku, int val, int i, int j) {
        for( int k=0 ; k < 9 ; k++) {
            if( sudoku[k][j] == val)
                return false;
        }
        return true;
    }
    public static boolean checkSubMatrixConstraint(int[][] sudoku, int val, int i, int j) {
        int rowStart = -1, rowEnd = -1;
        int colStart = -1,colEnd = -1;
        for( int k = 0 ; k < 9; k+=3) {
            if( i >= k && i < k+3 ) {
                rowStart = k ;
                rowEnd = k+3;
            }
            if( j >= k && j < k+3 ) {
                colStart = k ;
                colEnd = k+3;
            }
        }
        for( int l = rowStart ; l < rowEnd ; l++) {
            for( int m = colStart ; m < colEnd ; m++) {
                if( sudoku[l][m] == val ) {
                    return false;
                }
            }
        }
        return true;
    }
}
