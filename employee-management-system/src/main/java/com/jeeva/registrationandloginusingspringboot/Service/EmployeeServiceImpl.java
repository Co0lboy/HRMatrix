package com.jeeva.registrationandloginusingspringboot.Service;

import com.jeeva.registrationandloginusingspringboot.Model.Employee;
import com.jeeva.registrationandloginusingspringboot.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository ;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(Long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public void deleteEmployeeById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
