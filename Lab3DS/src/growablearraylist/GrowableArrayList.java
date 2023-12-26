package growablearraylist;

import java.util.Arrays;

public class GrowableArrayList<E> implements List<E> {

    // instance variables
    public static final int CAPACITY = 16;
    private E[] array;
    private int size = 0;

    // constructors
    public GrowableArrayList() {
        this(CAPACITY);
    }

   
    public GrowableArrayList(int capacity) {
        array = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
       return array[i];
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        E v = array[i];
        array[i] = e;
        return v;
    }

    @Override
    public void add(E e) {
        if (size == array.length) {
            checkCapacity(); // check capacity before adding element
        }
        array[size] = e;
        size++;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == array.length) {
            checkCapacity(); // check capacity before adding element
        }
        // Shift elements to make room for the new element
        for (int s = size; s > i; s--) {
            array[s] = array[s - 1];
        }
        array[i] = e;
        size++;
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        E removedV = array[i];
        // Shift elements to fill the gap left by the removed element
        for (int r = i; r < size - 1; r++) {
            array[r] = array[r + 1];
        }
        array[size - 1] = null; // Clear the last element
        size--;
        return removedV;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int j = 0; j < size; j++) {
            if (j > 0) sb.append(", ");
            sb.append(array[j]);
        }
        sb.append(")");
        return sb.toString();
    }

   
    private void checkCapacity() {
        int newCapacity = array.length * 2;
  
        array = Arrays.copyOf(array, newCapacity);
    
    }
}
