package sample.org.sample.service;

import org.springframework.stereotype.Service;
import sample.org.sample.entity.Customer;
import sample.org.sample.repository.CustomerRepository;

import java.util.List;

@Service 
public class CustomerService {
    
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Save customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
