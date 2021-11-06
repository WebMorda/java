package pro.sky.part2.lesson6.services;

import pro.sky.part2.lesson6.data.Employee;

import java.util.List;
import java.util.Map;

public interface Department {
    Employee getEmployeeMinSalaryInDepartment(int departmentId);
    Employee getEmployeeMaxSalaryInDepartment(int departmentId);
    float getAverageSalary(int departmentId);
    float getSalaryDepartment(int departmentId);
    Map<String, Employee> getEmployeeDepartmentId(int departmentId);
    List<String> prepareEmployDepartmentPrint(Map<String, Employee> emp);
}
