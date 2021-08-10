package com.google.backtracking;

import java.util.List;
import java.util.ArrayList;

public class WordBoggle {
    public static void main (String args[]) {
        char board[][] = new char[][] {{'B','C','A'},{'C','H','E'},{'E','O','T'},{'S','S','P'}};
        int row = 0;
        int col = 0;
        if( board.length > 0 ) {
            row = board.length;
            col = board[0].length;
        }
        boolean[][] visited = new boolean[row][col];
        List<String> dictionary = new ArrayList<String>();
        dictionary.add("THIS");
        dictionary.add("CHESS");
        dictionary.add("TEA");

        System.out.println("Below mentioned words found in the board : " );
        for( int i = 0 ; i < dictionary.size() ; i++) {
            String word = dictionary.get(i);
            for( int j =0 ; j < row; j++) {
                for( int k = 0; k < col ; k++) {
                    if(word.charAt(0) == board[j][k] ) {
                        if(findWord(board, row, col, j, k, word, 0, visited)) {
                            System.out.print(word+"  ");
                        }
                    }
                }
            }
        }
    }
    public static boolean findWord(char[][] board, int row, int col, int j, int k, String word,int i, boolean[][] visited) {
        // Base condition
        if( i == word.length() ) {
            return true;
        }
        if( j < 0 || j >= row || k < 0 || k >= col ) {
            return false;
        }
        if(visited[j][k] || word.charAt(i) != board[j][k] ) {
            return false;
        }
        visited[j][k] = true;
        for( int l = -1; l <= 1 ; l++) {
            for(int m = -1; m <=1; m++){
                if( l ==0 && m == 0)
                    continue;
                if( findWord(board,row,col,j+l,k+m,word,i+1,visited)) {
                    return true;
                }
            }
        }
        visited[j][k] = false; // Backtrack to prev state
        return false;
    }
}
