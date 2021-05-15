package com.google.graph;

import java.util.Queue;
import java.util.LinkedList;

public class MinOpRequired {
    static class Num {
        int val;
        int steps;
        public Num(int a,int b) {
            val = a;
            steps = b;
        }
    }
    public static void main( String args[]) {
        int sourceNum = 2;
        int targetNum = 5;
        int minOps = bfs(sourceNum,targetNum);
        System.out.println("Minimum operations required : "+minOps);
    }
    public static int bfs( int x, int y) {
        Queue<Num> queue = new LinkedList<Num>();
        queue.add(new Num(x,0));
        while( queue.size() != 0) {
            Num num = queue.poll();
            int val = num.val;
            int steps = num.steps;
            if( val == y)
                return steps;
            int mul = val * 2;
            int sub = val - 1;
            if(mul >= 1 && mul <= 1000)
                queue.add(new Num(mul, steps+1));
            if(sub >= 1 && sub <= 1000)
                queue.add(new Num(sub,steps+1));
        }
        return -1;
    }
}

