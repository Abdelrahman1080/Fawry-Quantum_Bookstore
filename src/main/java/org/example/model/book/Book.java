package org.example.model.book;

import org.example.model.product.Product;

public abstract class Book implements Product {
    String ISBN;
    String title;
    double price;
    int yearPublished;

    public Book() {
    }

    public Book(String ISBN, String title, double price, int yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    @Override
    public String getId() {
        return ISBN;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getYear() {
        return yearPublished;
    }

    @Override
    public abstract boolean isForSale();
}
