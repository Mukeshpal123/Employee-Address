package com.example.studentcourses.Employee_address.service;

import com.example.studentcourses.Employee_address.model.Address;
import com.example.studentcourses.Employee_address.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public List<Address> getAllAddress() {
        return (List<Address>) addressRepo.findAll();
    }

    public ResponseEntity<Address> getAddressById(Long id) {
        Optional<Address> address = addressRepo.findById(id);
        if(address.isPresent()){
            return ResponseEntity.ok(address.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Address> createAddress(Address address) {
        Address saved = addressRepo.save(address);
        return ResponseEntity.created(URI.create(""+saved.getId())).body(saved);
    }


    public ResponseEntity<Address> updateAddress(Long id,Address address) {
        Optional<Address> existingAddress = addressRepo.findById(id);
        if (existingAddress.isPresent()) {
            address.setId(id);
            Address savedAddress = addressRepo.save(address);
            return ResponseEntity.ok(savedAddress);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> deleteAddressById(Long id) {
        Optional<Address> address = addressRepo.findById(id);
        if (address.isPresent()) {
            addressRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
