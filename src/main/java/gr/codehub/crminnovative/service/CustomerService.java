package gr.codehub.crminnovative.service;

import gr.codehub.crminnovative.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomer();
    Customer addCustomer(Customer customer);
    boolean deleteCustomer(int customerIndex);
}
