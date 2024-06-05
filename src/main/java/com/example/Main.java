package com.example;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
    
        // Use getters
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Age: " + student1.getAge());
    
        // Use setters
        student1.setName("Alicia");
        student1.setAge(21);
    
        // Display student details
        student1.displayDetails();
        student2.displayDetails();
        System.out.println("_________________________________________");

    
        // Use static function

        Book book1 = new Book("Java", "Shashank Sir", 5);
        Book book2 = new Book("Python", "Ravi", 10);

        System.out.println("Name of Book 1 "+book1.getBookTitle());
        System.out.println("Name of Book 2 "+book2.getBookTitle());

        book1.bookDetails();
        System.out.println("_________________________________________");

        book2.bookDetails();
        book1.setAuthor("Manikyam");
        book2.setCopies(854);

        book1.bookDetails();
        System.out.println("_________________________________________");
        book2.bookDetails();


        
    }
    

    
}


