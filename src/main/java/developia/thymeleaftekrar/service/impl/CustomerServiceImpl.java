package developia.thymeleaftekrar.service.impl;

import developia.thymeleaftekrar.model.Customer;
import developia.thymeleaftekrar.repository.CustomerRepository;
import developia.thymeleaftekrar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void create(Customer customer) {
        if (customer.getFirstName().length() > 20){
            throw new IllegalArgumentException("too long name");
        }

        customerRepository.save(customer);
    }
}
