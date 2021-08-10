package com.google.faq;

import java.util.HashSet;

public class HappyNumbers {
    public static void main(String args[]){
        int n = 32;
        System.out.println("Number "+n+" is happy number :"+isHappy(n));
    }
    public static boolean isHappy(int n)
    {
        HashSet<Integer>set  = new HashSet<>();
        set.add(n);
        while(n>0)
        {
            int sum = 0;
            while(n>0)
            {
                int digit = n%10;
                sum+=(digit*digit);
                n = n/10;
            }
            if(sum==1)
                return true;
            else if(set.contains(sum))
                return false;
            set.add(sum);
            n = sum;
        }
        return false;
    }
}
