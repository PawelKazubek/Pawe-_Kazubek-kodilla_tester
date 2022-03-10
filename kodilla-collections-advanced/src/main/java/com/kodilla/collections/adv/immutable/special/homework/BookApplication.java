package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new BookManager().createBook("Hobbit", "J.R.R. Tolkien");
        Book book2 = new BookManager().createBook("Gra o tron", "George R.R. Martin");
        Book book3 = new BookManager().createBook("Conan barbarzyńca", "Robert E. Howard");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
