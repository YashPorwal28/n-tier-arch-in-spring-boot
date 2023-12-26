package com.amigoscode.api;

import com.amigoscode.api.customer.CustomerController;
import com.amigoscode.api.customer.CustomerDataAccessService;
import com.amigoscode.api.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@SpringBootApplication

public class ApiApplication {

//	Never do this
//	CustomerService customerService = new CustomerService(new CustomerDataAccessService());
//	CustomerController customerController = new CustomerController(new CustomerService());
// ie initilizing all the classes manualy

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);


	}








}
