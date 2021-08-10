package com.google.dp;

public class CoinChangeII{
    public static void main(String args[]) {
        int coin[]  =new int[] {1, 2 , 3};
        int sum = 7;
        int size = 3;
        System.out.println("Min no. of coins : "+minimizeCoin(coin, sum, size) );
    }
    public static int minimizeCoin( int coin[], int sum, int n) {
        int[][] t = new int[n+1][sum+1];
        for(int i = 0; i <= n ; i++)
        {
            for(int j=0 ; j <= sum ; j++)
            {
                if( j == 0)
                    t[i][j] = 0;
                if(i ==0)
                    t[i][j] = Integer.MAX_VALUE - 1;
                if( i==1) {
                    t[i][j] = j % coin[0]  == 0 ?  j/coin[0] : Integer.MAX_VALUE - 1;
                }
            }
        }

        for(int i = 2; i <= n ; i++)
        {
            for(int j=1 ; j <= sum ; j++)
            {
                if( coin[i-1] <= j)
                    t[i][j] = Math.min( 1 +  t[i][j - coin[i-1]], t[i-1][j]);
                else
                    t[i][j] = t[i-1][j];

            }
        }
        return t[n][sum];
    }
}
