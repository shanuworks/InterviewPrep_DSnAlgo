package com.google.dp;
import java.util.Arrays;
public class EggDroppingMemoize {
    public static void main( String args[]) {
        int floor = 36;
        int egg = 2;
        int[][] t = new int[floor+1][egg+1];
        for(int[] a:t) {
            Arrays.fill(a,-1);
        }

        System.out.println("Min no. of  attempts : "+ minAttempt(floor, egg,t) );
    }
    public static int minAttempt(int floor, int egg,int[][] t){
        if( floor < 0 || egg <= 0 )
            return -1;
        if( floor == 0 || floor == 1 || egg == 1) {
            t[floor][egg] = floor ;
            return floor;
        }
        if( t[floor][egg] != -1 )
            return t[floor][egg];
        int minAttempt = Integer.MAX_VALUE;
        for( int k = 1 ; k <= floor ; k++) {
            int tempAttempt = 1 + Math.max(minAttempt(k-1,egg-1,t), minAttempt(floor-k, egg,t) );
            if( tempAttempt < minAttempt)
                minAttempt = tempAttempt;
        }
        return t[floor][egg]  = minAttempt;
    }
}


