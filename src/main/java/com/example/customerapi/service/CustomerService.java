package com.example.customerapi.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.customerapi.dto.CustomerDTO;

@Service
public class CustomerService {

    private final Map<Long, CustomerDTO> customerMap = new HashMap<>();
    private Long currentId = 1L;

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        customerDTO.setId(currentId++);
        customerMap.put(customerDTO.getId(), customerDTO);
        return customerDTO;
    }

    public CustomerDTO getCustomerById(Long id) {
        return customerMap.get(id);
    }

    public List<CustomerDTO> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
        if (!customerMap.containsKey(id)) return null;
        customerDTO.setId(id);
        customerMap.put(id, customerDTO);
        return customerDTO;
    }

    public boolean deleteCustomer(Long id) {
        return customerMap.remove(id) != null;
    }
}
