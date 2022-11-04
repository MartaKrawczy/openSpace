package library;

import java.util.List;

public class LibraryService implements Library {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public List<Book> getBookList() {
        return libraryRepository.getAllBooks();
    }

    @Override
    public User registerUser(String name, String surname, ID id) {
        User user = new User();
        return user;
    }

    @Override
    public boolean reserveBook(User user, Book book) {
        if (book.getRentalStatus() != RentalStatus.BOOKED && book.getRentalStatus() != RentalStatus.RENT) {
            libraryRepository.changeBookStatus(user, book, RentalStatus.BOOKED);
            return true;
        }
        return false;
    }

    @Override
    public boolean reserveBook(User user, Long id) {
        Book book = libraryRepository.fingById(id);
        if (book != null) {
            if (book.getRentalStatus() != RentalStatus.BOOKED && book.getRentalStatus() != RentalStatus.RENT) {
                libraryRepository.changeBookStatus(user, id, RentalStatus.BOOKED);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rentBook(User user, Book book) {
        if (book.getBookStatus() != RentalStatus.RENT && book.getBookStatus() != RentalStatus.BOOKED) {
            libraryRepository.changeRentalStatus(user, book, RentalStatus.RENT);
            return true;
        }
        return false;
    }

    @Override
    public boolean rentBook(User user, Long id) {
        Book book = libraryRepository.fingById(id);
        if (book != null) {
            if (book.getBookStatus() != RentalStatus.BOOKED && book.getRentalStatus() != RentalStatus.RENT) {
                libraryRepository.changeBookStatus(user, id, RentalStatus.RENT);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> getBorrowedBooks(User user) {
        return libraryRepository.getUserBooks(user);
    }

    @Override
    public boolean returnBook(User user, Book book) {
        if ((book.getBookStatus() == RentalStatus.RENT || book.getBookStatus() == RentalStatus.BOOKED) && (book.getOwner() == user)) {
            libraryRepository.getUserBooks(user).remove(book);
            libraryRepository.changeBookStatus(user, book, RentalStatus.FREE);
            libraryRepository.changeRentalStatus(user, book, RentalStatus.FREE);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(User user, Long id) {
        if (user != null) {
            libraryRepository.getUserBooks(user).remove(returnBook(user, id));
            libraryRepository.changeBookStatus(user, id, RentalStatus.FREE);
            return true;
        }
        return false;
    }

    @Override
    public List<Desk> getAvailableDesks() {
        return libraryRepository.getAllFreeDesks();
    }

    @Override
    public boolean reserveDesk(Desk desk) {
        if (desk.getBookedStatus() == BookedStatus.FREE) {
            libraryRepository.changeDeskStatus(desk, BookedStatus.BOOKED);
            return true;
        }
        return false;
    }

    @Override
    public boolean reserveDesk(Long id) {
        Desk desk = new Desk(id);
        if (desk.getDeskId() != null) {
            libraryRepository.changeDeskStatus(id, BookedStatus.BOOKED);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIn(Desk desk) {
        if (desk.getBookedStatus() == BookedStatus.FREE && desk != null) {
            libraryRepository.changeDeskStatus(desk, BookedStatus.BOOKED);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIn(Long id) {
        if (libraryRepository.findById(id) != null && libraryRepository.findById(id).getBookedStatus() == BookedStatus.FREE) {
            libraryRepository.changeDeskStatus(id, BookedStatus.BOOKED);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOut(Desk desk) {
        if (desk.getBookedStatus() == BookedStatus.BOOKED && desk != null) {
            libraryRepository.changeDeskStatus(desk, BookedStatus.FREE);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOut(Long id) {
        if (libraryRepository.findById(id) != null && libraryRepository.findById(id).getBookedStatus() == BookedStatus.BOOKED) {
            libraryRepository.changeDeskStatus(id, BookedStatus.FREE);
            return true;
        }
        return false;
    }

    @Override
    public List<Desk> getDeskList() {
        return libraryRepository.getAllDesks();
    }
}
