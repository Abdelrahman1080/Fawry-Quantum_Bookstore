package org.example.model.book;

public class PaperBook extends Book {
    int stock;
    public PaperBook(String ISBN, String title, double price, int yearPublished, int stock) {
        super(ISBN, title, price, yearPublished);
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void incStock(int stock) {
        this.stock+=stock;
    }
    public void decStock(int stock) {
        if(this.stock-stock < 0) {
            throw new IllegalArgumentException("Stock amount exceeds stock limit for Book "+ this.getTitle());
        }
        else
             this.stock-=stock;
    }

    @Override
    public boolean isForSale() {
        return stock > 0;
    }
}
