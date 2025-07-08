package org.example.services.printService;

import org.example.model.product.Product;

import java.util.List;

public class PrintService {
    public static void PrintProductList(List<Product> products){
        for(Product p : products){
            System.out.println("Product: "+p.getTitle()+"\tPrice: "+p.getPrice() +"Year "+p.getYear() );
        }
    }
}
