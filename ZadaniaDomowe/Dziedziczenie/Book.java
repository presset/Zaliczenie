package ZadaniaDomowe.Dziedziczenie;

import ZadaniaDomowe.ObiektyKlasy.Author;

public class Book {
    private int id;
    private String title;
    private boolean availabe = true;
    private ZadaniaDomowe.ObiektyKlasy.Author author;
    private ZadaniaDomowe.ObiektyKlasy.Author[] additionalAuthors;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, ZadaniaDomowe.ObiektyKlasy.Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, ZadaniaDomowe.ObiektyKlasy.Author author, ZadaniaDomowe.ObiektyKlasy.Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailabe() {
        return availabe;
    }

    public ZadaniaDomowe.ObiektyKlasy.Author getAuthor() {
        return author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }
}
