package org.example.services.Purshase;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;
import org.example.model.book.Ebook;
import org.example.services.Delivery.EmailService;

public class EbookPurshasehandler extends PurchaseHandler{
    EmailService emailService;

    public EbookPurshasehandler(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public double PurchaseHandler(Product product, int quantity, CustomerInfo customerInfo) {
        if(!(product instanceof Ebook))
            throw new IllegalArgumentException(" Wrong Purchase Proceccing : " + product.getClass());
        else {
            Ebook ebook = (Ebook) product;
            double total=product.getPrice()*quantity;
            emailService.deliver(product,quantity,customerInfo);
            return total;
        }
    }
}
