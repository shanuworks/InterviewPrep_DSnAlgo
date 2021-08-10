package com.google.matrix;

public class RotateImage {
    public static void main(String args[]){
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int temp = -1;
        int count = row-2+1;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                temp = matrix[i][j];
                temp = findPositionAndFit(matrix,row,col,i,j,count,temp);
            }
        }
    }
    public static int findPositionAndFit(int[][] matrix, int row, int col, int i, int j, int count,int temp){
        while(count > 0) {
            j++;
            if(isValid(row,col,i,j))
                count--;
            else {
                i++;
                if(isValid(row,col,i,j))
                    count--;
            }
        }
        int temp2 = matrix[i][j];
        matrix[i][j] = temp;
        return temp2;
    }

    public static boolean isValid(int row, int col, int i, int j){
        if( i >= 0 && i <row && j >=0 && j < col )
            return true;
        return false;
    }
}
