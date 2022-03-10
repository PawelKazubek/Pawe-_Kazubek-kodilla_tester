package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static Book createBook(String title, String author) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("J.R.R. Tolkien", "Hobbit"));
        books.add(new Book("George R.R. Martin", "Gra o tron"));
        books.add(new Book("Robert E. Howard", "Conan barbarzyńca"));
        return new Book(author, title);

    }

}
