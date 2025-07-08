package org.example.model.customer;

public class CustomerInfo {
    String email;
    String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerInfo() {
    }

    public CustomerInfo(String email, String address) {
        this.email = email;
        this.address = address;
    }
}
