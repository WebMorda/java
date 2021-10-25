package pro.sky.part2.lesson5.services;

import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.stereotype.Service;
import pro.sky.part2.lesson5.exception.InternalServerError;
import pro.sky.part2.lesson5.exception.NotFoundException;
import pro.sky.part2.lesson5.models.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("Аркадий", "Аверченко"));
        employees.add(new Employee("Корней", "Чуковский"));
        employees.add(new Employee("Иван", "Бунин"));
        employees.add(new Employee("Владимир", "Маяковский"));
        employees.add(new Employee("Анна", "Ахматова"));
        employees.add(new Employee("Осип", "Мандельштам"));
        employees.add(new Employee("Александр", "Блок"));
        employees.add(new Employee("Зинаида", "Гиппиус"));
        employees.add(new Employee("Фёдор", "Сологуб"));
        employees.add(new Employee("Иннокентий", "Анненский"));
    }

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.add(employee);
        return employee;
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)){
            employees.remove(employee);
            return "Пользователь " + employee.getFirstName() + " " + employee.getLastName() + " удален!";
        }
        else {
            return "Пользователь " + employee.getFirstName() + " " + employee.getLastName() + " не найден!";
        }
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
       Employee employee = new Employee(firstName, lastName);
       if (employees.contains(employee)){
           int index = employees.indexOf(employee);
           return employees.get(index);
       }
        throw new NotFoundException();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employees;
    }
}
