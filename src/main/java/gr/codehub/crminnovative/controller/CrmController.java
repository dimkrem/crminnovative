package gr.codehub.crminnovative.controller;

import gr.codehub.crminnovative.model.Customer;
import gr.codehub.crminnovative.service.CustomerService;
import gr.codehub.crminnovative.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrmController {
    private CustomerService customerService;

    public CrmController() {
        customerService = new CustomerServiceImpl();
    }

    @RequestMapping("hello")
    public String getHello() {
        return "<b>Hello</b>";
    }

    //end point poy episterefei ta dedomena
    @GetMapping("customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomer();
    }

    @PostMapping("add/{name}")
    public Customer addCustomer(@PathVariable String name) {
        return customerService.addCustomer((new Customer(name)));
    }
    @PostMapping("addcustomer")
    public Customer addCustomerAllDetails(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }


    @DeleteMapping ("remove/{id}")
    public boolean deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }

}
