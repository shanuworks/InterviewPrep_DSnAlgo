package com.google.faq;

import java.util.Queue;
import java.util.PriorityQueue;

public class ClassRoom {
    private int capacity;
    private int size ;
    private int seats[] ;
    private Queue<Vacant> heap = null;

    public ClassRoom(int capacity) {
        this.size = 0 ;
        this.capacity = capacity;
        seats = new int[capacity];
        // Max Heap
        heap = new PriorityQueue<Vacant>((a,b) -> b.getDistance().compareTo(a.getDistance()));
    }
    static class Vacant{
        private int distance;
        private int start;
        private int end;

        public Integer getDistance(){
            return distance;
        }

        public Integer getStart() {
            return start;
        }
        public Integer getEnd() {
            return end;
        }


        public Vacant(int distance, int start, int end){
            this.distance = distance;
            this.start = start;
            this.end = end;
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return size == 0 ;
    }

    public int addStudent() {
        if( isFull()) {
            System.out.print("Classroom is full...");
            return -1;
        }
        // Base case
        if( size == 0 ) {
            seats[0] = 1;
            size++;
            return 1;
        } else if( size == 1 && seats[0] == 1) {
            size++;
            seats[capacity-1] = 1;
            heap.add(new Vacant(capacity-size,1,capacity-2));
            return capacity;
        }
        if( heap.size() > 0) {
            Vacant v = heap.remove();
            int start = v.getStart();
            int end = v.getEnd();
            int mid = (end+start)/2;
            seats[mid] = 1;
            size++;
            if( mid-start != 0)
                heap.add(new Vacant(mid-start,start,mid-1));
            if( end-mid != 0 )
                heap.add(new Vacant(end-mid,mid+1,end));
            return mid+1;
        }
        return -1;
    }

    public void removeStudent(int pos) {
        if( isEmpty()) {
            System.out.print("Classroom is empty...");
            return;
        }
        if(seats[pos-1] != 1) {
            System.out.print("Position is already empty...");
            return;
        }
        size--;
    }

    public int remove(int studentNo) {
        if( isEmpty()) {
            System.out.print("Classroom is empty...");
            return -1;
        }
        if( studentNo > size ) {
            System.out.print("Student is not there in classroom ");
            return -1;
        }
        size--;
        return 0;
    }

    public void display() {
        for( int i = 0 ; i < capacity ; i++ ) {
            System.out.print(seats[i] + " ");
        }
        System.out.println("");
    }

    public static void main( String args[]) {
        ClassRoom classRoom = new ClassRoom(10);

        System.out.println("Classroom Empty : "+classRoom.isEmpty());
        System.out.println("Classroom Full : "+classRoom.isFull());
        System.out.println("No of Occupied seats in class : " + classRoom.getSize());
        System.out.println("Displaying Class Room status at the moment ");
        classRoom.display();

        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());
        System.out.println("Student added at position : "+classRoom.addStudent());

        System.out.println("Displaying Class Room status at the moment ");
        classRoom.display();

        System.out.println("No of Occupied seats in class : " + classRoom.getSize());
    }
}



