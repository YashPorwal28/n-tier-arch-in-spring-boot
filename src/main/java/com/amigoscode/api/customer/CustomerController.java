package com.amigoscode.api.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CustomerController {

    private  final CustomerService customerService ;

    // CustomerService customerService , this is injected from application context


    // @Autowired means, find bean from application context , and inject it
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers (){
        return customerService.getALlCustomers();
    }
    @GetMapping("/customers/{id}")
    public List<Customer> getCustomersWithId
            (@PathVariable("id") Integer customerId){
        return (List<Customer>) customerService.getCustomer(customerId);
    };


}
