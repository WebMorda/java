package pro.sky.part2.lesson5.services;

import pro.sky.part2.lesson5.models.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee addEmployee(String firstName, String lastName);

    Boolean removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    List<Employee> getAllEmployee();
}
