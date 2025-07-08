package org.example.services.Purshase;

import org.example.model.product.Product;
import org.example.model.book.Ebook;
import org.example.model.book.PaperBook;
import org.example.services.Delivery.EmailService;
import org.example.services.Delivery.ShippingDelivery;

public class PurshaseFactory {
    public static PurchaseHandler createPurchaseHandler(Product product) {
        if (product instanceof PaperBook) {
            return new PaperBookPurchaseHandler(new ShippingDelivery());
        }
        if(product instanceof Ebook)
            return new EbookPurshasehandler(new EmailService());
        else
            throw new IllegalArgumentException("Product Is not For sale: " + product.getClass());


    }

}
