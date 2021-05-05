package com.rogerserra.employeemanager.repo;

import com.rogerserra.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id); //Spring JPA is smart enough to understand delete <something> ById

    Employee findEmployeeById(Long id); //We may not have an employee, that's why we use Optional
}
