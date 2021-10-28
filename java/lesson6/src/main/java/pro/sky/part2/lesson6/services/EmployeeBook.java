package pro.sky.part2.lesson6.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson6.data.Employee;

import java.util.*;

@Service
public class EmployeeBook implements IEmployeeBook {
    private HashMap<Integer, Employee> employees;

    public EmployeeBook() {
        employees = new HashMap<>();
        employees.put(1, new Employee("Аркадий Аверченко Тимофеевич", 3, 100));
        employees.put(2, new Employee("Корней Чуковский Иванович", 3, 130));
        employees.put(3, new Employee("Иван Бунин Алексеевич", 3, 90));
        employees.put(4, new Employee("Владимир Маяковский Владимирович", 4, 80));
        employees.put(5, new Employee("Анна Ахматова Андреевна", 2, 115));
        employees.put(6, new Employee("Осип Мандельштам Эмильевич", 2, 105));
        employees.put(7, new Employee("Александр Блок Александрович", 1, 95));
        employees.put(8, new Employee("Зинаида Гиппиус Николаевна", 1, 110));
        employees.put(9, new Employee("Фёдор Сологуб Кузьмич", 1, 75));
        employees.put(10, new Employee("Иннокентий Анненский Фёдорович", 1, 85));
    }

    @Override
    public HashMap<Integer, Employee> getAllEmployee() {
        return new HashMap<>(employees);
    }

    public Integer getSalary() {
        return sumSalary();
    }

    @Override
    public Employee getEmployeeMinSalary() {
        Employee minSalary = employees.get(1);

        for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
            if (employee.getValue().getSalary() < minSalary.getSalary()) {
                minSalary = employee.getValue();
            }
        }

        return minSalary;
    }

    @Override
    public Employee getEmployeeMaxSalary() {
        Employee maxSalary = employees.get(1);

        for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
            if (employee.getValue().getSalary() > maxSalary.getSalary()) {
                maxSalary = employee.getValue();
            }
        }

        return maxSalary;
    }

    @Override
    public Integer getAverageSalary(){
        int sum = sumSalary();

        return sum / employees.size();
    }

    @Override
    public List<String> getFullname(){
        List<String> fullName = new ArrayList<>();

        for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
            fullName.add(employee.getValue().getFullName());
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
