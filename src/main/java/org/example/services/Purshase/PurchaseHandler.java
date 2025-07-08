package org.example.services.Purshase;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;

public abstract class PurchaseHandler {
    public abstract double PurchaseHandler(Product product, int quantity, CustomerInfo customerInfo) ;
}
