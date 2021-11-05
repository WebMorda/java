package pro.sky.part2.lesson6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.part2.lesson6.data.Employee;
import pro.sky.part2.lesson6.services.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final Department department;

    public DepartmentController(Department department){
        this.department = department;
    }

    @GetMapping(path = "/min-salary")
    public Employee getEmployeeMinSalary(@RequestParam int d){
        return department.getEmployeeMinSalaryInDepartment(d);
    }

    @GetMapping(path = "/max-salary")
    public Employee getEmployeeMaxSalary(@RequestParam int d){
        return department.getEmployeeMaxSalaryInDepartment(d);
    }

    @GetMapping(path = "/averageSalary")
    public float getAverageSalary(@RequestParam int d) {
        return department.getAverageSalary(d);
    }

    @GetMapping(path = "/salary")
    public float getSalaryDepartment(@RequestParam int d) {
        return department.getSalaryDepartment(d);
    }
}
