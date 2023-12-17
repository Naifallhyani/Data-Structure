package queue;



public class SinglyLinkedList<E> {
    

    // instance variables of the SinglyLinkedList
  /** The head node of the list */
  private Node<E> head = null;               // head node of the list (or null if empty)

  /** The last node of the list */
  private Node<E> tail = null;               // last node of the list (or null if empty)

  /** Number of nodes in the list */
  private int size = 0;                      // number of nodes in the list

  /** Constructs an initially empty list. */
  public SinglyLinkedList() { }              // constructs an initially empty list

  // access methods
  /**
   * Returns the number of elements in the linked list.
   * @return number of elements in the linked list
   */
  public int size() { return size;}

  /**
   * Tests whether the linked list is empty.
   * @return true if the linked list is empty, false otherwise
   */
  public boolean isEmpty() {return size == 0;}

  /**
   * Returns (but does not remove) the first element of the list
   * @return element at the front of the list (or null if empty)
   */
  public E first() {
      if (isEmpty()) ;
      return head.getElement();
  }

  /**
   * Returns (but does not remove) the last element of the list.
   * @return element at the end of the list (or null if empty)
   */
  public E last() {
      if (isEmpty()) return null;
      return tail.getElement();
  }

  /**
   * Adds an element to the front of the list.
   * @param e  the new element to add
   */
  public void addFirst(E e) {
      Node<E> newNode = new Node<>(e, head);
      head = newNode;
      if (isEmpty()) {
          tail = newNode; // if the list was empty, now the new node is both head and tail
      }
      size++;
  }

  /**
   * Adds an element to the end of the list.
   * @param e  the new element to add
   */
  public void addLast(E e) {
      Node<E> newNode = new Node<>(e, null);
      if (isEmpty()) {
          head = newNode; // if the list was empty, now the new node is both head and tail
      } else {
          tail.setNext(newNode);
      }
      tail = newNode;
      size++;
  }

  /**
   * Removes and returns the first element of the list.
   * @return the removed element (or null if empty)
   */
  public E removeFirst() {
      if (isEmpty()) return null;
      E removedElement = head.getElement();
      head = head.getNext();
      size--;
      if (isEmpty()) {
          tail = null; // if the list is now empty, reset the tail to null
      }
      return removedElement;
  }

  /**
   * Removes and returns the last element of the list.
   * @return the removed element (or null if empty)
   */
  public E removeLast() {
      if (isEmpty()) return null;
      E removedElement = tail.getElement();
      if (size == 1) {
          head = null;
          tail = null;
      } else {
          Node<E> current = head;
          while (current.getNext() != tail) {
              current = current.getNext();
          }
          current.setNext(null);
          tail = current;
      }
      size--;
      return removedElement;
  }

  // ... (existing code)
}