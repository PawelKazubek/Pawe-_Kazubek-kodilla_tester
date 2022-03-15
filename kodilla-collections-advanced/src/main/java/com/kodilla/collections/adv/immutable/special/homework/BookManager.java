package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> books = new ArrayList<>();

    public static Book createBook(String author, String title) {
        for (Book book : books) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                return book;
            }
        }
        Book book = new Book(author, title);
        books.add(book);

        return book;
    }
}
