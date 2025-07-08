package org.example.model.book;

public class Ebook extends Book {
    String fileType;

    public Ebook(String fileType) {
        this.fileType = fileType;
    }

    public Ebook(String ISBN, String title, double price, int yearPublished, String fileType) {
        super(ISBN, title, price, yearPublished);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
}
