package fr.arolla;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class Persontest {
    List<Book> getBooks(Personne person) {
        return Optional.ofNullable(person)
                .filter(pers -> pers.getAge() < 40)
                .map(Personne::getBooks)
                .orElse(Collections.emptyList());
    }

    @Test
    void test3() {
        List<Book> books = getBooks(null);
        assertThat(books).isEmpty();
    }

    @Test
    void test() {
        Personne person = new Personne("John", 40, List.of(new Book("Title")));
        List<Book> books = getBooks(person);
        assertThat(books).isEmpty();
    }

    @Test
    void test2() {
        Personne person = new Personne("Toto", 20, List.of(new Book("Book1"), new Book("Book2")));
        List<Book> books = getBooks(person);
        assertThat(books)
                .extracting(Book::getTitle)
                .containsExactly("Book1", "Book2");
    }
}
