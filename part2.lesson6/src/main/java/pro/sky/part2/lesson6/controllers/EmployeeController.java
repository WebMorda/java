package pro.sky.part2.lesson6.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.part2.lesson6.data.Employee;
import pro.sky.part2.lesson6.services.EmployeeBook;
import pro.sky.part2.lesson6.services.Salary;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeBook employeeBook;
    private final Salary salary;

    public EmployeeController(EmployeeBook employeeBook, Salary salary) {
        this.employeeBook = employeeBook;
        this.salary = salary;
    }

    @GetMapping
    public Map<String, Employee> getAllEmp() {
        return employeeBook.getAllEmployee();
    }

    @GetMapping(path = "/salary")
    public int getSalary() {
        return salary.getSalary(employeeBook.getAllEmployee());
    }

    @GetMapping(path = "/minSalary")
    public Employee getMinSalary() {
        return salary.getEmployeeMinSalary(employeeBook.getAllEmployee());
    }

    @GetMapping(path = "/maxSalary")
    public Employee getMaxSalary() {
        return salary.getEmployeeMaxSalary(employeeBook.getAllEmployee());
    }

    @GetMapping(path = "/averageSalary")
    public int getAverageSalary() {
        return salary.getAverageSalary(employeeBook.getAllEmployee());
    }

    @GetMapping(path = "/fullNames")
    public List<String> getFullNames() {
        return employeeBook.getFullnames();
    }

    @GetMapping(path = "/index-salary")
    public Map<String, Employee> updateSalary(@RequestParam int index){
        return salary.updateSalary(index);
    }
}