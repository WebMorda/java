package pro.sky.part2.lesson7.services;

import pro.sky.part2.lesson7.data.Employee;

import java.util.List;
import java.util.Map;

public interface SalaryService {
    double getSalary(List<Employee> employees);

    Employee getEmployeeMinSalary(List<Employee> employees);

    Employee getEmployeeMaxSalary(List<Employee> employees);

    double getAverageSalary(List<Employee> employees);

    void updateSalary(List<Employee> emp, int index);
}
