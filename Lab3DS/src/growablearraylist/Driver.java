package growablearraylist;

public class Driver {
    public static void main(String[] args) {
        // Creating a GrowableArrayList with the default constructor
        GrowableArrayList<String> list = new GrowableArrayList<>();

        System.out.println("The capcity is  " + GrowableArrayList.CAPACITY);
        // Adding elements to the list
        list.add("5");
        list.add("15");
        list.add("20");
        list.add("25");
        list.add("30");
       

        System.out.println("Array List / " + list);
        // Testing size and isEmpty methods
        System.out.println("size = "  + list.size());
        System.out.println("Is Empty? / " + list.isEmpty());

        
        
        // Testing get method
        System.out.println("Get index 4 / " + list.get(4));

        
        
        
        // Testing set method
        String V = list.set(4, "35");
        System.out.println("Set element / " + V);
        System.out.println("Final List / " + list);
    
        
        
        // Testing add at specific index
     
    list.add(0, "Null");
     list.add(2, "30");
       
        System.out.println(list);
        
        

      //  Testing remove method
      String removedV = list.remove(2);
       System.out.println("This is the Removed value " + removedV);
       System.out.println("Final list " + list);
    }
   
}
