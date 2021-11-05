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
        if (employees.add(employee)) {
            return employee;
        }
        throw new InternalServerError();
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.remove(employee)){
            return employee;
        }
        throw new InternalServerError();
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        int index = employees.indexOf(employee);
        if (index != -1) {
            return employees.get(index);
        }
        throw new NotFoundException();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<Employee>(employees);
    }
}
