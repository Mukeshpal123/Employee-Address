package com.example.studentcourses.Employee_address.service;

import com.example.studentcourses.Employee_address.model.Employee;
import com.example.studentcourses.Employee_address.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepo.findAll();
    }

    public ResponseEntity<Employee> findEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if(employee.isPresent()){
            return ResponseEntity.ok(employee.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Employee> createEmployee(Employee employee) {
        return ResponseEntity.created(URI.create( ""+employeeRepo.save(employee).getId())).body(employeeRepo.save(employee));
    }

    public ResponseEntity<Employee> updateEmployees(Long id, Employee employee) {
        Optional<Employee> existingEmployee = employeeRepo.findById(id);
        if (existingEmployee.isPresent()) {
            employee.setId(id);
            return ResponseEntity.ok(employeeRepo.save(employee));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> deleteEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if (employee.isPresent()) {
            employeeRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
