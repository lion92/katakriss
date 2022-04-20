package fr.arolla;

import java.util.List;

public class Personne {
    String name;
    int age;
    List<Book> books;

    public static void main (String args){

    }

    public Personne(String name, int age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
