package fr.arolla;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(String title){
        Book book=new Book(title);
        bookRepository.save(book);
    }
}
