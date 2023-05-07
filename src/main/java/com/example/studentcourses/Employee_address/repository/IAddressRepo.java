package com.example.studentcourses.Employee_address.repository;

import com.example.studentcourses.Employee_address.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address, Long> {
}
