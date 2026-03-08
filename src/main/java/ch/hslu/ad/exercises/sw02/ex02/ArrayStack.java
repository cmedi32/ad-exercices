package ch.hslu.ad.exercises.sw02.ex02;

public class ArrayStack implements Stack {
    private final String[] elements;
    private final int capacity;
    private int topIndex;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.elements = new String[capacity];
        this.topIndex = -1;
    }

    @Override
    public void push(String item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[++topIndex] = item;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[topIndex--];
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == capacity - 1;
    }
}
