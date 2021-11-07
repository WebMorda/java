package pro.sky.part2.lesson7.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson7.data.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeBookService employeeBook;
    private final SalaryService salary;

    public DepartmentServiceImpl(EmployeeBookService employeeBook, SalaryService salary) {
        this.employeeBook = employeeBook;
        this.salary = salary;
    }

    @Override
    public Employee getEmployeeMinSalaryInDepartment(int departmentId) {
        return salary.getEmployeeMinSalary(getEmployeeDepartmentId(departmentId));
    }

    @Override
    public Employee getEmployeeMaxSalaryInDepartment(int departmentId) {
        return salary.getEmployeeMaxSalary(getEmployeeDepartmentId(departmentId));
    }

    @Override
    public double getAverageSalary(int departmentId) {
        return salary.getAverageSalary(getEmployeeDepartmentId(departmentId));
    }

    @Override
    public double getSalaryDepartment(int departmentId) {
        return salary.getSalary(getEmployeeDepartmentId(departmentId));
    }

    @Override
    public List<Employee> getEmployeeDepartmentId(int departmentId) {
        return employeeBook.getAllEmployee().stream().filter((employee -> employee.getDepartment() == departmentId)).toList();
    }

    @Override
    public List<String> prepareEmployDepartmentPrint(List<Employee> emp) {
        return emp.stream().map((e) -> e.getFullname() + " " + e.getSalary()).toList();
    }
}