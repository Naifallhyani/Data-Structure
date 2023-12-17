package SinglyLinkedListLab;


public class Student {

    // instance variables of the Student
    private String name;
    private int age;
    private int studentID;
    
    // constructs a student
    public Student(String name, int age, int studentID){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }
    
    // access methods
    /**
    * Returns the name instance variables
    * @return the name instance variables
    */
    public String getName() { return name; }

    /**
    * Returns the age instance variables
    * @return the age instance variables
    */
    public int getAge() { return age; }

    /**
    * Returns the student id instance variables
    * @return the student id instance variables
    */
    public int getStudentID() { return studentID; }
    
    /**
    * Produces a string representation of the contents of the object.
    * This exists for debugging purposes only.
    */
    public String toString() { 
        return studentID + " - " + name + " (" + age + ")" ; 
  }
}
