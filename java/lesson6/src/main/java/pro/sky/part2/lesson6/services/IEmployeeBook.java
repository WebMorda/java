package pro.sky.part2.lesson6.services;

import pro.sky.part2.lesson6.data.Employee;

import java.util.HashMap;
import java.util.List;

public interface IEmployeeBook {
    HashMap<Integer, Employee> getAllEmployee();

    Integer getSalary();

    Employee getEmployeeMinSalary();

    Employee getEmployeeMaxSalary();

    Integer getAverageSalary();

    List<String> getFullname();
}
