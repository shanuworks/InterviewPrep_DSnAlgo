package com.google.dp;

public class EvaluateExpression {
    public static void main( String args[]) {
        String s = "T&F|T";
        System.out.println("Num of ways to evaluate true are : "+ evaluate( s ,0, s.length() - 1,true ));
    }
    public static int evaluate(String s, int i, int j,boolean isTrue){
        int noOfWays = 0;
        if( i > j)
            return 0;
        if( i == j) {
            if(isTrue) {
                if( s.charAt(i) == 'T' || s.charAt(i) == 't' )
                    return 1;
                else
                    return 0;
            } else {
                if( s.charAt(i) == 'F' || s.charAt(i) == 'f' )
                    return 1;
                else
                    return 0;
            }
        }
        for( int k = i+1 ; k < j ; k+=2) {
            int leftTrue = evaluate (s,i,k-1,true);
            int leftFalse = evaluate (s,i,k-1,false);
            int rightTrue = evaluate (s,k+1,j,true);
            int rightFalse= evaluate (s,k+1,j,false);

            if( s.charAt(k) == '&' ) {
                if( isTrue) {
                    noOfWays = noOfWays + leftTrue * rightTrue ;
                } else {
                    noOfWays = noOfWays + leftFalse * rightFalse + leftTrue * rightFalse + leftFalse * rightTrue ;
                }
            }
            if( s.charAt(k) == '|' ) {
                if( isTrue) {
                    noOfWays = noOfWays + leftTrue * rightTrue + leftTrue * rightFalse + leftFalse * rightTrue ;
                } else {
                    noOfWays = noOfWays + leftFalse * rightFalse ;						}
            }
            if( s.charAt(k) == '^' ) {
                if( isTrue) {
                    noOfWays = noOfWays + leftTrue * rightFalse + leftFalse * rightTrue ;
                } else {
                    noOfWays = noOfWays +  leftTrue * rightTrue + leftFalse * rightFalse ;						}
            }
        }
        return noOfWays;
    }
}

