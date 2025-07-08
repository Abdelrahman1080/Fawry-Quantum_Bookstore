package org.example.model.book;

public class DemoBook extends Book {


    public DemoBook() {
    }

    public DemoBook(String ISBN, String title, double price, int yearPublished) {
        super(ISBN, title, price, yearPublished);
    }

    @Override
    public boolean isForSale() {
        return false;
    }
}
