package pro.sky.part2.lesson7.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.part2.lesson7.data.Employee;
import pro.sky.part2.lesson7.services.DepartmentService;
import pro.sky.part2.lesson7.services.EmployeeBookService;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;
    private final EmployeeBookService employeeBookService;

    public DepartmentController(DepartmentService departmentService, EmployeeBookService employeeBookService){
        this.departmentService = departmentService;
        this.employeeBookService = employeeBookService;
    }

    @GetMapping(path = "/min-salary")
    public Employee getMinSalary(@RequestParam int d) {
        return departmentService.getEmployeeMinSalaryInDepartment(d);
    }

    @GetMapping(path = "/max-salary")
    public Employee getMaxSalary(@RequestParam int d) {
        return departmentService.getEmployeeMaxSalaryInDepartment(d);
    }

    @GetMapping(path = "/all")
    public List<Employee> getAllEmployeeDepartment(@RequestParam(required = false) Integer d) {
        if (d != null) {
            return employeeBookService.getEmployeesByDepartment(departmentService.getEmployeeByDepartmentId(d));
        }else {
            List<Employee> employees = employeeBookService.getAllEmployee();
            employees.sort(Comparator.comparing(Employee::getDepartment));
            return employeeBookService.getEmployeesByDepartment(employees);
        }
    }
}
