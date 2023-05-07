package com.example.studentcourses.Employee_address.repository;

import com.example.studentcourses.Employee_address.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee ,Long> {
}
