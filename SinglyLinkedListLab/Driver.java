/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedListLab;

/**
 *
 * @author nsseb
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinglyLinkedList<Student> ll = new SinglyLinkedList<Student>();
        
        ll.addFirst(new Student("Ali", 19,4440001));
        ll.addFirst(new Student("Omar", 18,4440002));
        ll.addLast(new Student("Khalid", 17,4440003));
        ll.addFirst(new Student("Saleh", 20,4440004));
        
                
        System.out.println(ll.toString());
        
        // Remove last element
        System.out.println("Fist element: " +ll.first());
        
        // Remove first element
        System.out.println("Last element: " +ll.last());
                
        // Remove last element
        System.out.println("Element removed: " +ll.removeLast());
        
        // Remove first element
        System.out.println("Element removed: " +ll.removeFirst());
                
        // Print Linked List size
        System.out.println(ll.size());
        
        
        
    }
    
}
