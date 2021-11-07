package pro.sky.part2.lesson7.services;

import pro.sky.part2.lesson7.data.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getEmployeeMinSalaryInDepartment(int departmentId);
    Employee getEmployeeMaxSalaryInDepartment(int departmentId);
    double getAverageSalary(int departmentId);
    double getSalaryDepartment(int departmentId);
    List<Employee> getEmployeeDepartmentId(int departmentId);
    List<String> prepareEmployDepartmentPrint(List<Employee> emp);
}
