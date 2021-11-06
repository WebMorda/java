package pro.sky.part2.lesson6.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson6.data.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentImpl implements Department {
    private final EmployeeBook employeeBook;
    private final Salary salary;

    public DepartmentImpl(EmployeeBook employeeBook, Salary salary) {
        this.employeeBook = employeeBook;
        this.salary = salary;
    }

    @Override
    public Employee getEmployeeMinSalaryInDepartment(int departmentId) {
        Map<String, Employee> employees = getEmployeeDepartmentId(departmentId);

        return salary.getEmployeeMinSalary(employees);
    }

    @Override
    public Employee getEmployeeMaxSalaryInDepartment(int departmentId) {
        Map<String, Employee> employees = getEmployeeDepartmentId(departmentId);

        return salary.getEmployeeMaxSalary(employees);
    }

    @Override
    public float getAverageSalary(int departmentId) {
        Map<String, Employee> employees = getEmployeeDepartmentId(departmentId);
        return salary.getAverageSalary(employees);
    }

    @Override
    public float getSalaryDepartment(int departmentId) {
        Map<String, Employee> employees = getEmployeeDepartmentId(departmentId);
        return salary.getSalary(employees);
    }

    @Override
    public Map<String, Employee> getEmployeeDepartmentId(int departmentId) {
        Map<String, Employee> employees = employeeBook.getAllEmployee();
        Map<String, Employee> employeesDepartment = new HashMap<>();

        for (Map.Entry<String, Employee> employeeEntry : employees.entrySet()) {
            if (employeeEntry.getValue().getDepartment() == departmentId) {
                employeesDepartment.put(employeeEntry.getKey(), employeeEntry.getValue());
            }
        }
        return employeesDepartment;
    }

    @Override
    public List<String> prepareEmployDepartmentPrint(Map<String, Employee> emp) {
        List<String> list = new ArrayList<>();
        for (Employee value : emp.values()) {
            list.add(value.getFullname() + " " + value.getSalary());
        }

        return list;
    }
}
