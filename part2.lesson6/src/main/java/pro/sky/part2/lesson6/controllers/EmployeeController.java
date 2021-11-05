package pro.sky.part2.lesson6.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.part2.lesson6.data.Employee;
import pro.sky.part2.lesson6.services.EmployeeBook;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeBook employeeBook;

    public EmployeeController(EmployeeBook employeeBook) {
        this.employeeBook = employeeBook;
    }

    @GetMapping
    public Map<String, Employee> getAllEmp() {
        return employeeBook.getAllEmployee();
    }

    @GetMapping(path = "/salary")
    public int getSalary() {
        return employeeBook.getSalary();
    }

    @GetMapping(path = "/minSalary")
    public Employee getMinSalary() {
        return employeeBook.getEmployeeMinSalary();
    }

    @GetMapping(path = "/maxSalary")
    public Employee getMaxSalary() {
        return employeeBook.getEmployeeMaxSalary();
    }

    @GetMapping(path = "/averageSalary")
    public int getAverageSalary() {
        return employeeBook.getAverageSalary();
    }

    @GetMapping(path = "/fullNames")
    public List<String> getFullNames() {
        return employeeBook.getFullnames();
    }
}