package com.company;

public class Deque<T> {
    private int size;
    private int head;
    private T[] arr;

    public Deque(int size) {
        this.size = size;
        head = -1;
        arr = (T[]) (new Object[size]);
    }

    public boolean isEmpty() {
        return (this.head == -1);
    }

    public void push(T item) {
        if (size != arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            arr[++head] = item;
        }
    }

    public T pop() {
        T item = null;
        if (isEmpty()) {
            System.out.println("Is empty");
        } else {
            item = arr[head--];
        }
        return item;
    }

    public T peekFirst() {
        T item = null;
        if (isEmpty()) {
            System.out.println("Is empty");
        } else {
            item = arr[head];
        }
        return item;
    }

    public T peekLast() {
        T item = null;
        if (isEmpty()) {
            System.out.println("Is empty");
        } else {
            item = arr[size - arr.length];
        }
        return item;
    }

    public boolean addFirst(T item) {
        if (size != head) {
            arr[++head] = item;
            return true;
        }
        return false;
    }

    public boolean addLast(T item) {
        if (size != head) {
            arr[size - arr.length] = item;
            return true;
        }
        return false;
    }

    public T pollFirst() {
        T item = null;
        if (size != head) {
            item = arr[head];
            arr[head] = null;
        }
        return item;
    }

    public T pollLast() {
        T item = null;
        if (size != head) {
            item = arr[size - arr.length];
            arr[size - arr.length] = null;
        }
        return item;
    }
}
