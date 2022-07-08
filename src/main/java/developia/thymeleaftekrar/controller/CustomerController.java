package developia.thymeleaftekrar.controller;

import developia.thymeleaftekrar.model.Customer;
import developia.thymeleaftekrar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public String customers (Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @PostMapping("/customer/create")
    public String create (@ModelAttribute Customer customer){
        customerService.create(customer);
        return "redirect:/customers";
    }
}
