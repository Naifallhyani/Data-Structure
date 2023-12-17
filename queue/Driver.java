package queue;

public class Driver {

    public static void main(String[] args) {
        System.out.println("\nStart of Linked List Queue Demonstrator");
        Queue<Integer> q = new LinledListQueue<>();// contents: ()
        q.enqueue(3);                              // contents: (5)
        q.enqueue(5);                              // contents: (5, 3)
        System.out.println(q.size());              // contents: (5, 3)     outputs 2
        System.out.println(q.dequeue());           // contents: (3)        outputs 3
        System.out.println(q.isEmpty());           // contents: (3)        outputs false
        System.out.println(q.dequeue());           // contents: ()         outputs 5
        System.out.println(q.isEmpty());           // contents: ()         outputs true
        System.out.println(q.dequeue());           // contents: ()         outputs null
        q.enqueue(7);                              // contents: (7)
        q.enqueue(9);                              // contents: (7, 9)
        System.out.println(q.first());             // contents: (7, 9)     outputs 7
        q.enqueue(4);                              // contents: (7, 9, 4)
        System.out.println(q.size());              // contents: (7, 9, 4)  outputs 3
        System.out.println(q.dequeue());           // contents: (9, 4)     outputs 7
        q.enqueue(6);                              // contents: (9, 4, 6)
        q.enqueue(8);                              // contents: (9, 4, 6, 8)
        System.out.println(q.dequeue());           // contents: (4, 6, 8)  outputs 9
    }
    
}
