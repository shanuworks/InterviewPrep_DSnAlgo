package com.google.linkedlists;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.ListIterator;

public class RemoveDuplicate {
    public static void main(String args[]) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(40);
        list.add(40);
        list.add(40);
        list.add(30);
        list.add(70);

        System.out.println("Before removing duplicates List is :"+list);
        Set<Integer> hset = new HashSet<Integer>();
        List<Integer> removeIndex = new ArrayList<Integer>();
        int index = -1;
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            index++;
            Integer i = listIterator.next();
            if(hset.contains(i))
                removeIndex.add(index);
            else
                hset.add(i);
        }
        int counter = 0;
        for(int i : removeIndex) {
            list.remove(i-counter);
            counter++;
        }
        System.out.println("Before removing duplicates List is :"+list);

    }
}
