package library;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class LibraryRepository {
private final List<Book> books;

    public LibraryRepository(List<Book> books) {
        this.books = books;
    }
    public Book fingById(Long id) {
        for (Book book : books ) {
            if(book.getId() == id){
                return book;
            }
        }return null;
    }

    public List<Book> getAllBooks(){
        return this.books;
    }

    public void changeBookStatus(User user,Book book, RenstalStatus renstalStatus){
        if(book != null){
            book.updateStatus(renstalStatus, user);
        }

    }

    public void changeBookStatus(User user, Long id, RenstalStatus renstalStatus){
        Book book = fingById(id);
       if(book != null){
           book.updateStatus(renstalStatus, user);
       }
    }

}
