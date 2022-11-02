package library;

import java.util.List;

public class LibraryService implements Library {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public List<Book> getBookList() {
        return null;
    }

    @Override
    public boolean reserveBook(User user, Book book) {
        if(book.getRentalStatus() != RenstalStatus.BOOKED && book.getRentalStatus() !=  RenstalStatus.RENT){
            libraryRepository.changeBookStatus(user,book,RenstalStatus.BOOKED);
            return true;
        }
        return false;
    }

    @Override
    public boolean reserveBook(User user, Long id) {
        Book book = libraryRepository.fingById(id);
        if(book != null){
            if(book.getRentalStatus() != RenstalStatus.BOOKED && book.getRentalStatus() !=  RenstalStatus.RENT){
                libraryRepository.changeBookStatus(user,id, RenstalStatus.BOOKED);
                return true;
            }
        } return false;
    }

    @Override
    public boolean rentBook(User user, Book book) {
        return false;
    }

    @Override
    public boolean rentBook(User user, Long id) {
        return false;
    }

    @Override
    public List<Book> getBorrowedBooks(User user) {
        return null;
    }

    @Override
    public boolean returnBook(User user, Book book) {
        return false;
    }

    @Override
    public boolean returnBook(User user, Long id) {
        return false;
    }

    @Override
    public List<Desk> getAvailableDesks() {
        return null;
    }

    @Override
    public boolean reserveDesk(Desk desk) {
        return false;
    }

    @Override
    public boolean reserveDesk(Long id) {
        return false;
    }

    @Override
    public boolean checkIn(Desk desk) {
        return false;
    }

    @Override
    public boolean checkIn(Long id) {
        return false;
    }

    @Override
    public boolean checkOut(Desk desk) {
        return false;
    }

    @Override
    public boolean checkOut(Long id) {
        return false;
    }

    @Override
    public List<Desk> getDeskList() {
        return null;
    }
}
