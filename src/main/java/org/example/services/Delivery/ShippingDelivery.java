package org.example.services.Delivery;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;
import org.example.model.book.PaperBook;

public class ShippingDelivery implements DeliveryService {
    public void deliver(Product product, int quantity, CustomerInfo customerInfo) {
        if(product instanceof PaperBook) {
            System.out.println("Shipping Paper Book " + product.getTitle() +" To Location " + customerInfo.getAddress()
            + " Quantity " + quantity);
        }
        else {
            throw new IllegalArgumentException("Cannot Shipping non Shippable Products");
        }
    }
}
