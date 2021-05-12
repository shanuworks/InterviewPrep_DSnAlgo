package com.google.dp;

import java.util.Map;
import java.util.HashMap;

public class EvaluateExpressionMemoize {
    public static void main( String args[]) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        String s = "T|F&T^F";
        System.out.println("Num of ways to evaluate true are : "+ evaluate( s ,map, 0, s.length() - 1,true ));
        System.out.println("map : "+ map);
    }
    public static Integer evaluate(String s, Map<String,Integer> map,  int i, int j,boolean isTrue){
        String key = i +" "+j+" "+isTrue ;
        int noOfWays = 0;
        if( i > j)
            return 0;
        if( map.containsKey(key))
            return map.get(key);
        if( i == j) {
            if(isTrue) {
                if( s.charAt(i) == 'T' || s.charAt(i) == 't' ) {
                    map.put( key, 1);
                    return 1;
                } else {
                    map.put( key, 0);
                    return 0;
                }
            } else {
                if( s.charAt(i) == 'F' || s.charAt(i) == 'f' ) {
                    map.put( key, 1);
                    return 1;
                } else {
                    map.put( key, 0);
                    return 0;
                }
            }
        }
        for( int k = i+1 ; k < j ; k+=2) {
            int leftTrue, leftFalse , rightTrue, rightFalse ;
            String keyLeftT = i +" "+(k-1)+" "+"true";
            String keyLeftF = i +" "+(k-1)+" "+"false";
            String keyRightT = (k+1) +" "+j+" "+"true";
            String keyRightF = (k+1) +" "+j+" "+"false";

            if( map.containsKey(keyLeftT))
                leftTrue = map.get(keyLeftT);
            else
                leftTrue = evaluate (s,map,i,k-1,true);

            if( map.containsKey(keyLeftF))
                leftFalse = map.get(keyLeftF);
            else
                leftFalse = evaluate (s,map,i,k-1,false);

            if(map.containsKey(keyRightT))
                rightTrue = map.get(keyRightT);
            else
                rightTrue = evaluate (s,map,k+1,j,true);

            if(map.containsKey(keyRightF))
                rightFalse = map.get(keyRightF);
            else
                rightFalse= evaluate (s,map,k+1,j,false);

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
        map.put(key , noOfWays);
        return noOfWays;
    }
}


