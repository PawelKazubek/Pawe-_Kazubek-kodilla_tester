package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("J.R.R. Tolkien", "Hobbit");
        Book book2 = BookManager.createBook("George R.R. Martin", "Gra o tron");
        Book book3 = BookManager.createBook("Robert E. Howard", "Conan barbarzyńca");
        Book book4 = BookManager.createBook("J.R.R. Tolkien", "Hobbit");

        System.out.println("-------------");
        System.out.println(book1==book2);
        System.out.println(book2==book3);
        System.out.println(book3==book1);
        System.out.println(book1==book4);
    }
}
