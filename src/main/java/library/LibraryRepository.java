package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    private final List<Book> books;
    private final List<Desk> desks;

    public LibraryRepository(List<Book> books, List<Desk> desks) {
        this.books = books;
        this.desks = desks;
    }

    public Book fingById(Long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Desk findById(Long deskId) {
        for (Desk desk : desks) {
            if (desk.getDeskId() == deskId) {
                return desk;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return this.books;
    }

    public List <Book> getUserBooks( User user){
        List<Book> userBooks = new ArrayList<Book>();
        for (Book book: books) {
            if(book.getOwner()==user);
            userBooks.add(book);
        }
        return userBooks;
    }

    public List<Book> getAllFreeBooks(){
        List<Book> freeBooks = new ArrayList<Book>();
        for (Book book: books) {
            if(book.getBookStatus()==RentalStatus.FREE);
            freeBooks.add(book);
        }
        return freeBooks;
    }


    public void changeBookStatus(User user, Book book, RentalStatus renstalStatus) {
        if (book != null) {
            book.updateStatus(renstalStatus, user);
        }
    }

    public void changeBookStatus(User user, Long id, RentalStatus renstalStatus) {
        Book book = fingById(id);
        if (book != null) {
            book.updateStatus(renstalStatus, user);
        }
    }

    public List<Desk> getAllDesks() {
        return this.desks;
    }

    public void changeDeskStatus(Long deskId, BookedStatus bookedStatus) {
        Desk desk = findById(deskId);
        if (desk != null) {
            desk.updateStatus(bookedStatus);
        }
    }

    public void changeDeskStatus(Desk desk, BookedStatus bookedStatus) {
        if (desk != null) {
            desk.updateStatus(bookedStatus);
        }
    }

    public void changeRentalStatus(User user, Book book, RentalStatus rent) {
        if (book!=null){
            book.updateStatus(rent,user);
        }
    }
}
