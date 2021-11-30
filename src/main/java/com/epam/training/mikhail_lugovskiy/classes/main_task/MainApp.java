package com.epam.training.mikhail_lugovskiy.classes.main_task;

import java.time.Year;

public class MainApp {
    public static void main(String[] args) {
        BooksList books = new BooksList();

        books.add(new Book("PowerShell for Sysadmins: Workflow Automation Made Easy", "Adam Bertram", "No Starch Press", Year.of(2020)));
        books.add(new Book("Eloquent JavaScript, 3rd Edition: A Modern Introduction to Programming", "Marijn Haverbeke", "No Starch Press", Year.of(2018)));
        books.add(new Book("Head First Java, 2nd Edition", "Kathy Sierra, Bert Bates", "O'Reilly Media", Year.of(2005)));
        books.add(new Book("Core Java Volume I--Fundamentals", "Cay Horstmann", "Pearson Education", Year.of(2018), 928,59.99, "Paperback"));

        Book bookPython1 = new Book();
        bookPython1.setAuthor("Eric Matthes");
        bookPython1.setTitle("Python Crash Course, 2nd Edition: A Hands-On, Project-Based Introduction to Programming");
        bookPython1.setPublisher("No Starch Press");
        bookPython1.setPublicationYear(Year.of(2019));
        bookPython1.setPrice(35.95);
        bookPython1.setCoverType("Paperback");
        bookPython1.setNumberOfPages(544);

        Book bookPython2 = new Book("Python Flash Cards: Syntax, Concepts, and Examples", "Eric Matthes", "No Starch Press", Year.of(2019));

        books.add(bookPython1);
        books.add(bookPython2);

        BooksList books2 = new BooksList(bookPython1, bookPython2);

        books.printBooksByAuthor("Eric Matthes");
        System.out.println();
        books.printBooksAfterYear(2018);
        System.out.println();
        books.printBooksByPublisher("O'Reilly Media");

        System.out.println("All books from books2 list:\n");
        books2.printAllBooks();

    }
}
