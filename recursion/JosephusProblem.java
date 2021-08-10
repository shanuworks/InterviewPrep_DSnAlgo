package com.google.recursion;

import java.util.List;
import java.util.ArrayList;

public class JosephusProblem {
    static List<Integer> personList = new ArrayList<Integer>();
    public static void main (String args[]) {
        int N = 5;
        int K = 2;
        int arr[] = new int[N];
        for( int i= 1; i <= N ; i++) {
            personList.add( i);
        }
        // K-1 as we are dealing with index and it starts from 0
        // We will start from 0 index, so index will be set to 0
        System.out.print("Last person will be : "+findSafePosition(0,N,K-1));
    }
    public static int findSafePosition(int index, int N, int K) {
        // Base condition
        if(N == 1 ) {
            return personList.get(0);
        }
        // Hypothesis
        int personToBeKilled = (index + K) % N;
        personList.remove(personToBeKilled);

        return findSafePosition(personToBeKilled, N-1, K);
    }
}
