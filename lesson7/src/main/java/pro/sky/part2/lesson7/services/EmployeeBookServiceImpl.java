package pro.sky.part2.lesson7.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.part2.lesson7.data.Employee;
import pro.sky.part2.lesson7.exception.BadRequestException;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {
    private final Map<String, Employee> employees;

    public EmployeeBookServiceImpl() {
        employees = new HashMap<>();
        employees.put("Аверченко Аркадий" ,new Employee("Аркадий", "Аверченко", 3, 100));
        employees.put("Чуковский Корней" ,new Employee("Корней", "Чуковский", 3, 130));
        employees.put("Бунин Иван", new Employee("Иван","Бунин", 3, 90));
        employees.put("Маяковский Владимир", new Employee("Владимир", "Маяковский", 4, 80));
        employees.put("Ахматова Анна", new Employee("Анна", "Ахматова", 2, 115));
        employees.put("Мандельштам Осип", new Employee("Осип", "Мандельштам", 2, 105));
        employees.put("Блок Александр", new Employee("Александр", "Блок", 1, 95));
        employees.put("Гиппиус Зинаида", new Employee("Зинаида", "Гиппиус", 1, 110));
        employees.put("Сологуб Фёдор", new Employee("Фёдор", "Сологуб", 1, 75));
        employees.put("Анненский Иннокентий", new Employee("Иннокентий", "Анненский", 1, 85));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public List<String> getFullNames(){
        return employees.values().stream().map(Employee::getFullname).toList();
    }

    @Override
    public void updateSalary(List<Employee> emp, double index) {
        emp.forEach((employee -> employee.setSalary(employee.getSalary() * index)));
    }

    @Override
    public List<Employee> getEmployeesByDepartment(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getFullname))
                .collect(Collectors.toList());
    }

    @Override
    public Employee searchEmployee(String fName, String lName){
        if (!StringUtils.containsAny(fName, "+-*/_=") && StringUtils.isAlphaSpace(fName)
        && !StringUtils.containsAny(lName, "+-*/_=") && StringUtils.isAlphaSpace(lName)){
            lName = StringUtils.capitalize(lName);
            fName = StringUtils.capitalize(fName);

            return employees.get(lName + " " + fName);
        } else {
            throw new BadRequestException();
        }

    }
}