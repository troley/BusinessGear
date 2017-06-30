package com.renarcus.businessgear.rest.controller;

import com.renarcus.businessgear.model.Customer;
import com.renarcus.businessgear.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Troley on 26-6-2017
 */
@RestController
@RequestMapping("/api/customer")
public class RestCustomerController {

    private CustomerService customerService;

    @Autowired
    public RestCustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllItems();
    }

    @RequestMapping(value = "/interested", method = RequestMethod.POST, consumes="application/json", headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<?> postInterestedCustomer(@RequestBody Customer c) {
        customerService.addItem(c);
        return new ResponseEntity<Customer>(c, HttpStatus.OK);
    }
}
