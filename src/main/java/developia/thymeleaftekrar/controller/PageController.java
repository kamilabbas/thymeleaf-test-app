package developia.thymeleaftekrar.controller;

import developia.thymeleaftekrar.model.Customer;
import developia.thymeleaftekrar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String home (){
        return "index";
    }

    @GetMapping("/create")
    public String create (Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "create";
    }
}
