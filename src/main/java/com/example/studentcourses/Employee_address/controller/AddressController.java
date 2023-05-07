package com.example.studentcourses.Employee_address.controller;

import com.example.studentcourses.Employee_address.model.Address;
import com.example.studentcourses.Employee_address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Address> createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

    @PutMapping("/id")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateAddress(id,address);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        return addressService.deleteAddressById(id);
    }


}
