package pro.sky.part2.lesson7.services;

import pro.sky.part2.lesson7.data.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeBookService {
    List<Employee> getAllEmployee();

    List<String> getFullNames();

    void updateSalary(List<Employee> emp, double index);

    List<Employee> getEmployeesByDepartment(List<Employee> employees);

    Employee searchEmployee(String fName, String lName);
}
