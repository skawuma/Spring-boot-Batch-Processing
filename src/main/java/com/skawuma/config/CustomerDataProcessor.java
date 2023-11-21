package com.skawuma.config;

import com.skawuma.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerDataProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
//        if(customer.getGender().equals("Male")) {
//            return customer;
//        }
//        return customer;
//    }
        int age = Integer.parseInt(customer.getAge());
        if (age >= 50) {
            return customer;
        }
        return null;
    }


}
