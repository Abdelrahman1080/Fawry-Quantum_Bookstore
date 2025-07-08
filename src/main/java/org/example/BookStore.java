package org.example;

import org.example.model.customer.CustomerInfo;
import org.example.model.product.Product;
import org.example.services.Purshase.PurchaseHandler;
import org.example.services.Purshase.PurshaseFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookStore {
    HashMap<String, Product> books = new HashMap<String, Product>();
        public void addProduct(Product p){
            books.put(p.getId(),p);
        }
        public void removeProduct(Product p){
            books.remove(p.getId());
        }
        public List<Product> getAllProduct(){
            return new ArrayList<Product>(books.values());
        }
        public Product getProduct(String id){
            return books.get(id);
        }

        public double purchase(String id, int quantity, CustomerInfo customerInfo){
            Product book = books.get(id);
            if(book==null){
                throw new RuntimeException("Book not found");
            }
            if(!book.isForSale())
                throw new IllegalStateException("Book " + book.getTitle() + " is not for sale");

            PurchaseHandler purchaseHandler=new PurshaseFactory().createPurchaseHandler(book);
            double totalPrice=purchaseHandler.PurchaseHandler(book,quantity,customerInfo);
            return totalPrice;
        }

        public List<Product> retrieveOutDatedProduct(int maxYear){
            List<Product> removedProducts=new ArrayList<>();

            for(Product p : books.values()){
                if(p.getYear()<maxYear){
                    removedProducts.add(p);

                }
            }
            for(Product p : removedProducts){
                books.remove(p.getId());
            }
            return removedProducts;
        }

        public int getTolalNumberOfBooks(){
            return books.size();
        }


}
