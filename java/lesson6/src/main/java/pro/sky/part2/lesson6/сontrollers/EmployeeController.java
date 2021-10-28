package pro.sky.part2.lesson6.сontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.part2.lesson6.data.Employee;
import pro.sky.part2.lesson6.services.IEmployeeBook;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final IEmployeeBook employeeBook;

    public EmployeeController(IEmployeeBook employeeBook) {
        this.employeeBook = employeeBook;
    }

    @GetMapping()
    public HashMap<Integer, Employee> index() {
        return employeeBook.getAllEmployee();
    }

    @GetMapping(path = "/salary")
    public Integer salary() {
        return employeeBook.getSalary();
    }

    @GetMapping(path = "/minSalary")
    public Employee minSalary() {
        return employeeBook.getEmployeeMinSalary();
    }

    @GetMapping(path = "/maxSalary")
    public Employee maxSalary() {
        return employeeBook.getEmployeeMaxSalary();
    }

    @GetMapping(path = "/averageSalary")
    public Integer averageSalary() {
        return employeeBook.getAverageSalary();
    }

    @GetMapping(path = "/fullName")
    public List<String> fullName() {
        return employeeBook.getFullname();
    }
}
