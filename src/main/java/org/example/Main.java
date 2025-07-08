package org.example;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;
import org.example.model.book.DemoBook;
import org.example.model.book.Ebook;
import org.example.model.book.PaperBook;
import org.example.services.printService.PrintService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerInfo customerInfo = new CustomerInfo("Farag@farag", "Dar-Elsalam");
            //Shipping Paper Book
        PaperBook paperBook1=new PaperBook("Pb1", "Java", 200, 2004, 10);
        BookStore bookStore = new BookStore();
        bookStore.addProduct(paperBook1);
        System.out.println(bookStore.purchase("Pb1",2,customerInfo));
        System.out.println();


        //Shipping E-Book
        Ebook EBook1=new Ebook("Eb1", "Spring", 300, 2004,"pdf");
        bookStore.addProduct(EBook1);
        System.out.println(bookStore.purchase("Eb1",3,customerInfo));
        System.out.println();


        // Trying to Purchase a Quantaty Bigger thatn what is exist in stocks(will return error)
        try {
            PaperBook paperBook2=new PaperBook("Pb2", "Java", 200, 2004, 1);
            bookStore.addProduct(paperBook2);

            System.out.println(bookStore.purchase("Pb2",2,customerInfo));

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        // Trying to Purchase Show case (will return error)
        try {
            DemoBook demoBook1=new DemoBook("Db2", "Novel", 200, 2004);
            bookStore.addProduct(demoBook1);
            System.out.println(bookStore.purchase("Db2",2,customerInfo));

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        // Removing outDated Books
           bookStore.addProduct(new PaperBook("Pb3", "Old", 200, 1900, 3));
           bookStore.addProduct(new DemoBook("Db3", "C#", 200, 1980));
           bookStore.addProduct(new PaperBook("Pb4", "Data Base", 200, 2001, 4));
           bookStore.addProduct(new DemoBook("Db4", "CPP", 200, 2003));

           List<Product> removedBooks= bookStore.retrieveOutDatedProduct(2000);
        System.out.println("Removed Books: ");
           PrintService.PrintProductList(removedBooks);
        System.out.println();
        System.out.println("Book Store After Removing OutDate Products :");
           PrintService.PrintProductList(bookStore.getAllProduct());



    }


}

