package com.epam.training.mikhail_lugovskiy.classes.main_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BooksList {
    private ArrayList<Book> booksList;

    public BooksList() {
        booksList = new ArrayList<>();
    }

    public BooksList(Book... books) {
        booksList = new ArrayList<>(Arrays.asList(books));
    }

    public void add(Book book) {
        booksList.add(book);
    }

    public void printAllBooks() {
        booksList.stream().sorted(Comparator.comparingInt(book -> book.getPublicationYear().getValue())).forEach(System.out::println);
    }

    public void printBooksByAuthor(String author) {
        System.out.println("Books by " + author + ":\n");
        booksList.stream().filter(book -> book.getAuthor().equals(author)).sorted(Comparator.comparingInt(book -> book.getPublicationYear().getValue())).forEach(System.out::println);
    }

    public void printBooksByPublisher(String publisher) {
        System.out.println("Books by \"" + publisher + "\" publisher:\n");
        booksList.stream().filter(book -> book.getPublisher().equals(publisher)).sorted(Comparator.comparingInt(book -> book.getPublicationYear().getValue())).forEach(System.out::println);
    }

    public void printBooksAfterYear(int year) {
        System.out.println("Books after " + year + " year:\n");
        booksList.stream().filter(book -> book.getPublicationYear().getValue() > year).sorted(Comparator.comparingInt(book -> book.getPublicationYear().getValue())).forEach(System.out::println);
    }
}
