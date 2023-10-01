package com.company;

public class Stack {
    int[] arr;
    int capacity;
    int top;

    Stack(int size) {
        // initialize the array
        // initialize the stack variables
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        return arr[top--];
    }

    public int getTop(){
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }

    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }


}
