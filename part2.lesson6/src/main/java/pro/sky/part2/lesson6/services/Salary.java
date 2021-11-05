package pro.sky.part2.lesson6.services;

import pro.sky.part2.lesson6.data.Employee;

import java.util.Map;

public interface Salary {
    int getSalary(Map<String, Employee> employees);

    Employee getEmployeeMinSalary(Map<String, Employee> employees);

    Employee getEmployeeMaxSalary(Map<String, Employee> employees);

    int getAverageSalary(Map<String, Employee> employees);

    Map<String, Employee> updateSalary(int index);
}
