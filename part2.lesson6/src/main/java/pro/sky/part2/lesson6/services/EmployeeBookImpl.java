package pro.sky.part2.lesson6.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson6.data.Employee;

import java.util.*;

@Service
public class EmployeeBookImpl implements EmployeeBook {
    private Map<String, Employee> employees;

    public EmployeeBookImpl() {
        employees = new HashMap<>();
        employees.put("Аркадий Аверченко", new Employee("Аркадий", "Аверченко", 3, 100));
        employees.put("Корней Чуковский", new Employee("Корней", "Чуковский", 3, 130));
        employees.put("Иван Бунин", new Employee("Иван","Бунин", 3, 90));
        employees.put("Владимир Маяковский", new Employee("Владимир", "Маяковский", 4, 80));
        employees.put("Анна Ахматова", new Employee("Анна", "Ахматова", 2, 115));
        employees.put("Осип Мандельштам", new Employee("Осип", "Мандельштам", 2, 105));
        employees.put("Александр Блок", new Employee("Александр", "Блок", 1, 95));
        employees.put("Зинаида Гиппиус", new Employee("Зинаида", "Гиппиус", 1, 110));
        employees.put("Фёдор Сологуб", new Employee("Фёдор", "Сологуб", 1, 75));
        employees.put("Иннокентий Анненский", new Employee("Иннокентий", "Анненский", 1, 85));
    }

    @Override
    public Map<String, Employee> getAllEmployee() {
        return new HashMap<>(employees);
    }

    public int getSalary() {
        return sumSalary();
    }

    @Override
    public Employee getEmployeeMinSalary() {
        Employee empMinSalary = null;

        for (Employee employee : employees.values()) {
            if (empMinSalary == null){
                empMinSalary = employee;
            } else {
                if (employee.getSalary() < empMinSalary.getSalary()) {
                    empMinSalary = employee;
                }
            }
        }
        return empMinSalary;
    }

    @Override
    public Employee getEmployeeMaxSalary() {
        Employee empMaxSalary = null;

        for (Employee employee : employees.values()) {
            if (empMaxSalary == null){
                empMaxSalary = employee;
            } else {
                if (employee.getSalary() > empMaxSalary.getSalary()) {
                    empMaxSalary = employee;
                }
            }
        }
        return empMaxSalary;
    }

    @Override
    public int getAverageSalary(){
        int sum = sumSalary();

        return sum / employees.size();
    }

    @Override
    public List<String> getFullnames(){
        List<String> fullName = new ArrayList<>();

        for (Employee employee : employees.values()) {
            fullName.add(employee.getFullname());
        }

        return fullName;
    }

    private int sumSalary() {
        Collection<Employee> emp = employees.values();
        int sum = 0;

        for (Employee employee : emp) {
            sum += employee.getSalary();
        }

        return sum;
    }
}