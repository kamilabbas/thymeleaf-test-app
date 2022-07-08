package developia.thymeleaftekrar.service;

import developia.thymeleaftekrar.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public Customer findById(Long id);

    public List<Customer> findAll();

    public Customer save (Customer customer);

    public void create(Customer customer);
}
