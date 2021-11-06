package pro.sky.part2.lesson6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.part2.lesson6.data.Employee;
import pro.sky.part2.lesson6.services.Department;
import pro.sky.part2.lesson6.services.Salary;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final Department department;
    private final Salary salary;

    public DepartmentController(Department department, Salary salary){
        this.department = department;
        this.salary = salary;
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

    @GetMapping(path = "/index-salary")
    public Map<String, Employee> updateSalary(@RequestParam int index, @RequestParam int d){
        salary.updateSalary(department.getEmployeeDepartmentId(d), index);
        return department.getEmployeeDepartmentId(d);
    }

    @GetMapping(path = "/employee")
    public List<String> getEmployee(@RequestParam int d){
        Map<String, Employee> employeeDepartment = department.getEmployeeDepartmentId(d);
        return department.prepareEmployDepartmentPrint(employeeDepartment);
    }
}
