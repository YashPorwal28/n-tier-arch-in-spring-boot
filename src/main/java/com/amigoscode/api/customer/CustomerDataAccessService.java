package com.amigoscode.api.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

public class CustomerDataAccessService implements  CustomerDAO{

    private static  List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer alex = new Customer(
                1, "Alex", "alex@gmail.com",23
        );
        customers.add(alex);

        Customer pre = new Customer(
                2, "pre","pre@gamil.com",68
        );
        customers.add(pre);

    }
    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream().filter(c->c.getId().equals(id))
                .findFirst();
    }


}
