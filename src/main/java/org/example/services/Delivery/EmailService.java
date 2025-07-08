package org.example.services.Delivery;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;
import org.example.model.book.Ebook;

public class EmailService implements DeliveryService{
    @Override
    public void deliver(Product product, int quantity, CustomerInfo customerInfo) {
        if(product instanceof Ebook){
            Ebook ebook = (Ebook) product;
            System.out.println("Delivering ebook " + ebook.getTitle() + " with quantity " + quantity+" via mail:"+
                    customerInfo.getEmail());
        }
        else {
            throw new IllegalArgumentException("Unsupported product type to be mailed");
        }
    }
}
