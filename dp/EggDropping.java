package com.google.dp;

public class EggDropping {
    public static void main( String args[]) {
        int floor = 36;
        int egg = 2;
        System.out.println("Min no. of  attempts : "+ minAttempt(floor, egg) );
    }
    public static int minAttempt(int floor, int egg){
        if( floor < 0 || egg <= 0 )
            return -1;
        if( floor == 0 || floor == 1 || egg == 1)
            return floor;
        int minAttempt = Integer.MAX_VALUE;
        for( int k = 1 ; k <= floor ; k++) {
            int tempAttempt = 1 + Math.max(minAttempt(k-1,egg-1), minAttempt(floor-k, egg) );
            if( tempAttempt < minAttempt)
                minAttempt = tempAttempt;
        }
        return minAttempt;
    }
}
