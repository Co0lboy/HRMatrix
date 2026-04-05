package com.jeeva.registrationandloginusingspringboot.Controller;

import com.jeeva.registrationandloginusingspringboot.Model.Employee;
import com.jeeva.registrationandloginusingspringboot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService ;
    @GetMapping("/showEmployees")
    public ModelAndView showEmployees () {
        ModelAndView mav = new ModelAndView("list-employees");
        List<Employee> list = employeeService.getAllEmployees();
        mav.addObject("employees",list);
        return mav ;
    }
    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm(){
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee newEmployee = new Employee();
        mav.addObject("employee",newEmployee);
        return mav ;
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/showEmployees" ;
    }
    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm (@RequestParam Long employeeId){
        ModelAndView mav = new ModelAndView("add-employee-form");
        Optional<Employee> employee = employeeService.findById(employeeId);
        mav.addObject("employee",employee);
        return mav ;
    }
    @GetMapping("/deleteEmployee")
    public String deleteEmployee (@RequestParam Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
        return "redirect:/showEmployees" ;
    }
}
