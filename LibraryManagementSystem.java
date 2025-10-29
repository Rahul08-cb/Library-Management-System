// src/models/Book.java
package models;

import java.time.LocalDate;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    private LocalDate dueDate;

    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
        this.dueDate = null;
    }

    // Getters and Setters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }
    public LocalDate getDueDate() { return dueDate; }
    
    public void setAvailable(boolean available) { isAvailable = available; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    @Override
    public String toString() {
        return String.format("ISBN: %s, Title: %s, Author: %s, Genre: %s, Available: %s",
                isbn, title, author, genre, isAvailable ? "Yes" : "No");
    }
}