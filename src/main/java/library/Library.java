package library;

import java.util.List;

public interface Library {
    List<Book> getBookList();
    //User user registerUser(String name, String surname, ID id);
    //what we can do with user?
    boolean reserveBook(User user, Book book);
    boolean reserveBook(User user, Long id);
    boolean rentBook(User user, Book book);
    boolean rentBook(User user, Long id);
    List<Book> getBorrowedBooks(User user);
    boolean returnBook(User user, Book book);
    boolean returnBook(User user, Long id);
    // add user

    List<Desk> getAvailableDesks();
    List<Desk> getDeskList();
    boolean reserveDesk(Desk desk);
    boolean reserveDesk(Long id);
    boolean checkIn(Desk desk);
    boolean checkIn(Long id);
    boolean checkOut(Desk desk);
    boolean checkOut(Long id);
}
