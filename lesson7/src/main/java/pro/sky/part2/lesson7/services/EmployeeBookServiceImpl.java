package pro.sky.part2.lesson7.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson7.data.Employee;

import java.util.*;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {
    private List<Employee> employees;

    public EmployeeBookServiceImpl() {
        employees = new ArrayList<>();
        employees.add(new Employee("Аркадий", "Аверченко", 3, 100));
        employees.add(new Employee("Корней", "Чуковский", 3, 130));
        employees.add(new Employee("Иван","Бунин", 3, 90));
        employees.add(new Employee("Владимир", "Маяковский", 4, 80));
        employees.add(new Employee("Анна", "Ахматова", 2, 115));
        employees.add(new Employee("Осип", "Мандельштам", 2, 105));
        employees.add(new Employee("Александр", "Блок", 1, 95));
        employees.add(new Employee("Зинаида", "Гиппиус", 1, 110));
        employees.add(new Employee("Фёдор", "Сологуб", 1, 75));
        employees.add(new Employee("Иннокентий", "Анненский", 1, 85));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employees);
    }

    @Override
    public List<String> getFullNames(){
        return employees.stream().map(Employee::getFullname).toList();
    }

    @Override
    public void updateSalary(List<Employee> emp, double index) {
        emp.forEach((employee -> employee.setSalary(employee.getSalary() * index)));
    }

    @Override
    public List<String> employeesByDepartment(List<Employee> employees) {
        int department = 0;
        List<String> emp = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment() != department){
                department = employee.getDepartment();
                emp.add("Отдел №" + department);
            }
            emp.add(employee.getFullname() + " " + employee.getSalary());
        }

        return emp;
    }
}