package com.company;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> dq = new Deque<>(5);
        dq.push(1);
        dq.push(2);
        dq.push(3);
        System.out.println("peekFirst: " + dq.peekFirst());
        System.out.println("peekLast: " + dq.peekLast());
        System.out.println("pop: " + dq.pop());
        System.out.println("addFirst: " + dq.addFirst(10));
        System.out.println("peekFirst: " + dq.peekFirst());
        System.out.println("addLast: " + dq.addLast(0));
        System.out.println("peekLast: " + dq.peekLast());
        System.out.println("pollFirst: " + dq.pollFirst());
        System.out.println("pollLast: " + dq.pollLast());
        System.out.println("isEmpty: " + dq.isEmpty());
    }
}
