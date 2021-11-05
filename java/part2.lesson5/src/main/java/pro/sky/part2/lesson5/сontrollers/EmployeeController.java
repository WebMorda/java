package pro.sky.part2.lesson5.сontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.part2.lesson5.exception.InternalServerError;
import pro.sky.part2.lesson5.models.Employee;
import pro.sky.part2.lesson5.services.IEmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String employee() {
        return "Добро пожаловать!";
    }

    @GetMapping(path = "/all")
    public List<Employee> all() {
        return employeeService.getAllEmployee();
    }

    @GetMapping(path = "/find")
    public Employee find(@RequestParam String f, @RequestParam String l) {
        return employeeService.findEmployee(f, l);
    }

    @GetMapping(path = "/add")
    public Employee add(@RequestParam String f, @RequestParam String l) {
        return employeeService.addEmployee(f, l);
    }

    @GetMapping(path = "/remove")
    public String remove(@RequestParam String f, @RequestParam String l) {
        if (employeeService.removeEmployee(f, l)) {
            return "Пользователь удален";
        } else {
            return "Пользователь не найден!";
        }
    }
}
