package fr.arolla;

public interface BookRepository {

    void save(Book book);

    boolean exists(Book book);

}
