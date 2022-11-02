package library;

import libraryDemo.Category;

import java.util.List;

public class Book {
   private static long counter = 1L;
    private Long id;
    private Category category;
    private String author;
    private String title;
    private User owner;
    private RenstalStatus renstalStatus;


    public Book( Category category, String author, String title) {
        this.category = category;
        this.author = author;
        this.title = title;
        this.renstalStatus = RenstalStatus.FREE;
        this.id = counter;
        counter++;
    }

    public void updateStatus(RenstalStatus renstalStatus, User user) {
        this.renstalStatus = renstalStatus;
        this.owner = user;
    }

    public Long getId() {
        return this.id;
    }

    public Category getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public RenstalStatus getRentalStatus() {
        return renstalStatus;
    }
}
