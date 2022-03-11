package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {

        return new Book(author, title);
    }
}
