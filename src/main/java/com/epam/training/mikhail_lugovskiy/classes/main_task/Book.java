package com.epam.training.mikhail_lugovskiy.classes.main_task;

import java.time.Year;

public class Book {

    private static int count;
    private final int id;
    private String title;
    private String author;
    private String publisher;
    private Year publicationYear;
    private Integer numberOfPages;
    private Double price;
    private String coverType;

    public Book() {
        id = ++count;
    }

     public Book(String title, String author, String publisher, Year publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        id = ++count;
    }

    public Book(String title, String author, String publisher, Year publicationYear, int numberOfPages, double price, String coverType) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.coverType = coverType;
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Year getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Year publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "id: " + this.getId() + "\n" +
                "title: " + this.getTitle() +  "\n" +
                "author: " + this.getAuthor() +  "\n" +
                "publisher: " + this.getPublisher() +  "\n" +
                "publication year: " + this.getPublicationYear() +  "\n" +
                "pages: " + this.getNumberOfPages() +  "\n" +
                "price: " + this.getPrice() +  "\n" +
                "cover type: " + this.getCoverType() +  "\n";
    }
}
