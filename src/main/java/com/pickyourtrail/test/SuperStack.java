package com.pickyourtrail.test;

import java.util.logging.Logger;

import static java.lang.String.valueOf;

public class SuperStack {

    private static Logger log = Logger.getLogger(SuperStack.class.getName());
    private final int maxSize;
    private final long[] stackArray;
    private int top;

    public SuperStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void pushHelper(long k) {
        push(k);
        peekHelper();
    }

    public void popHelper() {
        pop();
        peekHelper();
    }

    public void incHelper(int e, int k) {
        inc(e, k);
        peekHelper();
    }

    private void peekHelper() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            log.info("EMPTY");
        } else {
            long element = peek();
            System.out.println(element);
            log.info(valueOf(element));
        }
    }

    private void push(long j) {
        if(top==maxSize-1){
            System.out.println("Cannot push to a full stack");
            log.info("Cannot push to a full stack");
            return;
        }
        stackArray[++top] = j;
    }

    private long pop() {
        if(top==-1){
            System.out.println("Cannot pop empty stack");
            log.info("Cannot pop empty stack");
            return -1;
        }
        return stackArray[top--];
    }

    private long peek() {
        return stackArray[top];
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    private void inc(int e, int k) {
        for (int i = 0; i<top && i < e; i++) {
            stackArray[i] += k;
        }
    }
}