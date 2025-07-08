package org.example.services.Delivery;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;

public interface DeliveryService {
    public void deliver(Product product, int quantity, CustomerInfo customerInfo);
}
