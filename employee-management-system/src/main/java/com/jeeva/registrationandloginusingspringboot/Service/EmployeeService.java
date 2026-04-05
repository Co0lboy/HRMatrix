package com.jeeva.registrationandloginusingspringboot.Service;

import com.jeeva.registrationandloginusingspringboot.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Optional<Employee> findById(Long employeeId);

    public void deleteEmployeeById(Long employeeId);
}
