package com.amigoscode.api.customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;

    }

    public List<Customer> getALlCustomers(){
            return customerDAO.selectAllCustomers();

    }

    public Customer getCustomer(Integer id){
        return customerDAO.selectCustomerById(id)
                .orElseThrow(()-> new IllegalArgumentException("Customer wid id [%s] not found".formatted(id)));
    }

}
