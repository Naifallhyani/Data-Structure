package stack;

/**
 * Realization of a stack as an adaptation of a SinglyLinkedList.
 * 
 *
 */
public class LinkedListStack<E> implements Stack<E> {
    private Node<E> top; // top of the stack
    private int size;    // number of elements in the stack

    public LinkedListStack() {
        top = null; // stack is initially empty
        size = 0;
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
    public void push(E element) {
        Node<E> newNode = new Node<>(element, top);
        top = newNode; // set the new node as the top
        size++;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return top.getElement();
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E poppedElement = top.getElement();
        top = top.getNext(); // move top to the next node
        size--;
        return poppedElement;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = top;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
