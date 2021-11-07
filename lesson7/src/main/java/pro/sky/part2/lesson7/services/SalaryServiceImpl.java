package pro.sky.part2.lesson7.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson7.data.Employee;

import java.util.*;

@Service
public class SalaryServiceImpl implements SalaryService {
    private final EmployeeBookService employeeBook;

    public SalaryServiceImpl(EmployeeBookService employeeBook) {
        this.employeeBook = employeeBook;
    }

    public double getSalary(List<Employee> employees) {
        return getSum(employees);
    }

    private double getSum(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public void updateSalary(List<Employee> emp, int index) {
        employeeBook.updateSalary(emp, 1 + (index / 100f));
    }

    @Override
    public Employee getEmployeeMinSalary(List<Employee> employees) {
        return employees.stream().min(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Employee getEmployeeMaxSalary(List<Employee> employees) {
        return employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);

    }

    @Override
    public double getAverageSalary(List<Employee> employees) {
        double sum = getSum(employees);
        return sum / employees.size();
    }
}