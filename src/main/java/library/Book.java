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
    private RentalStatus rentalStatus;
    private RentalStatus bookStatus;


    public Book(Category category, String author, String title) {
        this.category = category;
        this.author = author;
        this.title = title;
        this.rentalStatus = RentalStatus.FREE;
        this.bookStatus = RentalStatus.FREE;
        this.id = counter;
        counter++;
    }


    public void updateStatus(RentalStatus renstalStatus, User user) {
        this.rentalStatus = renstalStatus;
        this.owner = user;
    }

    public Long getId() {
        return this.id;
    }

    public RentalStatus getRentalStatus() {
        return rentalStatus;
    }

    public RentalStatus getBookStatus() {
        return bookStatus;
    }

    public User getOwner() {
        return owner;
    }


}
