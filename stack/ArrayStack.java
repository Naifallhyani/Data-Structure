package stack;



public class ArrayStack<E> implements Stack<E> {

    public static final int CAPACITY = 1000; // default array capacity

    private E[] data; // generic array used for storage
    private int t = -1; // index of the top element in the stack

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public void push(E e) {
        if (size() == data.length) {
            throw new IllegalStateException("Stack is full");
        }
        data[++t] = e;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E poppedElement = data[t];
        data[t--] = null; // Dereference to help garbage collection
        return poppedElement;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= t; i++) {
            sb.append(data[i]);
            if (i < t) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}