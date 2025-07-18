package com.onlineshopping.allservices;

import java.util.*;

import com.onlineshopping.entities.Customer;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getUserId() == id)
                return c;
        }
        return null;
    }
}
