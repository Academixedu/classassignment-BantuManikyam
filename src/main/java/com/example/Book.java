package com.example;

/**
 * Book
 */
public class Book {
    private String bookTitle;
    private String author;
    private int copies;

    public Book(String bookTitle, String author, int copies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.copies = copies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopies() {
        return copies;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
    public void bookDetails(){
        System.out.println("Title of the book "+bookTitle);
        System.out.println("Author: "+author);
        System.out.println("Number of Copies "+copies);

    }
    public static void totalBooks(String total){
        System.out.println("Count "+total);
               
    }
    

    
}
/*
 * Requirements
Class Definition:
Define a class named Book.
Instance Variables:

The Book class should have private instance variables for the title (String), author (String), and number of copies (int).
Constructor:

The class should have a constructor that initializes the title, author, and number of copies of the book.
Getters and Setters:


Implement getter and setter methods for each instance variable.
The getter for the number of copies should return the current number of copies available.
The setter for the number of copies should allow updating the number of copies.
Additional Methods:

Implement a method displayBookDetails that prints the details of the book (title, author, and number of copies).
Implement a static method totalBooks that returns the total number of books created (use a static variable to keep track of the count).

Additional Instructions
understand the importance of encapsulation and how getters and setters help in maintaining it.
think about edge cases, such as setting negative values for the number of copies and how to handle them.
After implementing the class, test it with the example usage provided to ensure everything works correctly.
* 
 */