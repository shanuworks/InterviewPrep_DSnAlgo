package com.google.queues;
import java.util.LinkedList;
import java.util.Queue;
public class PalindromeCheck {
    public static void main(String args[]) {
        String s1 = "Don't nod";
        String s2 = "Was it a car or a cat I saw?";
        String s3 = "hello";
        String s4 = "I did, did I? ";
        String s5 = "Racecar";
        String s6 = "?????.....?12";

        System.out.println("\""+s1 +"\"  is palindrome - "+ isPalindrome(s1));
        System.out.println("\""+s2 +"\"  is palindrome - "+ isPalindrome(s2));
        System.out.println("\""+s3 +"\"  is palindrome - "+ isPalindrome(s3));
        System.out.println("\""+s4 +"\"  is palindrome - "+ isPalindrome(s4));
        System.out.println("\""+s5 +"\"  is palindrome - "+ isPalindrome(s5));
        System.out.println("\""+s6 +"\"  is palindrome - "+ isPalindrome(s6));

    }
    public static boolean isPalindrome(String s){
        LinkedList<Character> stack = new LinkedList<Character>();
        Queue<Character> queue = new LinkedList<Character>();
        String lowerCase = s.toLowerCase();
        for(int i=0 ; i < lowerCase.length() ; i++) {
            char c = lowerCase.charAt(i);
            if( c >= 'a' && c <= 'z' ) {
                queue.add(c); // addLast() of LinkedList class can be used here
                stack.push(c);
            }
        }
        if(stack.isEmpty() && !s.isEmpty()) {
            return false;
        }
        while( ! stack.isEmpty() && !queue.isEmpty()) {
            if(stack.pop() !=queue.remove()) //removeFirst() of LinkedList can be used
                return false;
        }
        return true;
    }
}
