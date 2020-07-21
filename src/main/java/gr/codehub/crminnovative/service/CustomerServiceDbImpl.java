package gr.codehub.crminnovative.service;

import gr.codehub.crminnovative.model.Customer;
import gr.codehub.crminnovative.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class CustomerServiceDbImpl implements CustomerService{

    @Autowired      // to fm vriskei to CustomerRepository kai syndeetai
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);

    }

    @Override
    public boolean deleteCustomer(int customerIndex) {
        customerRepository.deleteById(customerIndex);
        return true;
    }
}
