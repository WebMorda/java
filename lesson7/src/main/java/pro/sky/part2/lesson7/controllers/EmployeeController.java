package pro.sky.part2.lesson7.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.part2.lesson7.data.Employee;
import pro.sky.part2.lesson7.services.EmployeeBookService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeBookService employeeBookService;

    public EmployeeController(EmployeeBookService employeeBookService) {
        this.employeeBookService = employeeBookService;
    }

    @GetMapping(path = "/searchEmp")
    public Employee getMinSalary(@RequestParam String fName, @RequestParam String lName) {
        return employeeBookService.searchEmployee(fName, lName);
    }
}
