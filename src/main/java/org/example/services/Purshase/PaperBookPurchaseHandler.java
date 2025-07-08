package org.example.services.Purshase;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;
import org.example.model.book.PaperBook;
import org.example.services.Delivery.ShippingDelivery;

public class PaperBookPurchaseHandler extends PurchaseHandler{
    ShippingDelivery delivery;

    public PaperBookPurchaseHandler(ShippingDelivery shippingDelivery) {
        this.delivery = shippingDelivery;
    }

    @Override
    public double PurchaseHandler(Product product, int quantity, CustomerInfo customerInfo) {
        if(!(product instanceof PaperBook))
            throw new IllegalArgumentException("Illegal product type");
        if(quantity > ((PaperBook) product).getStock() )
            throw new IllegalArgumentException("Not enough Books in stock");
        else {
            PaperBook paperBook = (PaperBook) product;
            paperBook.decStock(quantity);
            double total= paperBook.getPrice()*quantity;
            delivery.deliver(product,quantity,customerInfo);
            return total;
        }
    }
}
