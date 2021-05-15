
package com.google.graph;

import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public class MinMoves {
    static class Matrix {
        int sourceX;
        int sourceY;
        int moves;
        public Matrix(int sourceX,int sourceY, int moves) {
            this.sourceX = sourceX;
            this.sourceY = sourceY;
            this.moves = moves;
        }

        @Override
        public int hashCode() {
            return this.sourceX * 31 + this.sourceY;
        }

        @Override
        public boolean equals( Object obj) {
            if( obj instanceof Matrix) {
                Matrix m = (Matrix) obj;
                return this.sourceX == m.sourceX && this.sourceY == m.sourceY;
            }
            return false;
        }

    }
    public static void main( String args[]) {
        int[][] matrix = {{ 0 , 3 , 2 },
                { 3 , 3 , 0 },
                { 1 , 3 , 0 }};
        int sourceX = -1, sourceY = -1, destX=-1, destY=-1;
        for( int i=0; i < matrix.length ; i++) {
            for( int j =0; j < matrix[i].length ; j ++) {
                if( matrix[i][j] == 1) {
                    sourceX = i;
                    sourceY = j;
                }
                else if( matrix[i][j] == 2) {
                    destX = i;
                    destY = j;
                }
                else
                    continue;
            }
        }
        Matrix mat = new Matrix(sourceX,sourceY,0);
        int minMoves = bfs(matrix, mat, destX, destY);
        System.out.println("Minimum moves required : "+minMoves);
    }
    public static int bfs( int[][]  matrix, Matrix mat, int destX, int destY) {
        int row = matrix.length;
        int col = matrix[0].length;
        Queue<Matrix> queue = new LinkedList<Matrix>();
        Set<Matrix> visited = new HashSet<Matrix>();
        queue.add(mat);
        visited.add(mat);
        while( queue.size() != 0) {
            Matrix m = queue.poll();

            int sourceX = m.sourceX;
            int sourceY = m.sourceY;
            int moves = m.moves;
            if( sourceX == destX && sourceY == destY)
                return moves;
            int incrSourceX = sourceX + 1;
            int incrSourceY = sourceY + 1;
            int decSourceX = sourceX -1;
            int decSourceY = sourceY - 1;
            if(decSourceY >= 0 && decSourceY < col && matrix[sourceX][decSourceY] != 0 ) {
                Matrix m1 = new Matrix(sourceX,decSourceY,moves+1);
                if( !visited.contains(m1)) {
                    queue.add(m1);
                    visited.add(m1);
                }
            }
            if(incrSourceY >= 0 && incrSourceY < col && matrix[sourceX][incrSourceY] != 0) {
                Matrix m1 = new Matrix(sourceX,incrSourceY,moves+1);
                if( !visited.contains(m1)) {
                    queue.add(m1);
                    visited.add(m1);
                }
            }
            if(decSourceX >= 0 && decSourceX < row && matrix[decSourceX][sourceY] != 0) {
                Matrix m1 = new Matrix(decSourceX,sourceY,moves+1);
                if( !visited.contains(m1)) {
                    queue.add(m1);
                    visited.add(m1);
                }
            }
            if(incrSourceX >= 0 && incrSourceX < row && matrix[incrSourceX][sourceY] != 0) {
                Matrix m1 = new Matrix(incrSourceX,sourceY,moves+1);
                if( !visited.contains(m1)) {
                    queue.add(m1);
                    visited.add(m1);
                }
            }
        }
        return -1;
    }
}

