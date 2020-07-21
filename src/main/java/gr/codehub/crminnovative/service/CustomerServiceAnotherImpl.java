package gr.codehub.crminnovative.service;

import gr.codehub.crminnovative.model.Customer;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;
@Qualifier("ImplLIST")
public class CustomerServiceAnotherImpl implements CustomerService{

    private List<Customer> customers = new ArrayList<>();


    @Override
    public List<Customer> getCustomer() {
        return customers;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customers.add(customer);
        return customers.get(customers.size() - 1);
    }

    @Override
    public boolean deleteCustomer(int customerIndex) {
        if (customerIndex >= 0 && customerIndex < customers.size()) {
            customers.remove(customerIndex);
            return true;
        }
        return false;
    }
}
