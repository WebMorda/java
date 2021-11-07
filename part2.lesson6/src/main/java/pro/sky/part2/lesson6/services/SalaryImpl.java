package pro.sky.part2.lesson6.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson6.data.Employee;

import java.util.Collection;
import java.util.Map;

@Service
public class SalaryImpl implements Salary {
    private final EmployeeBook employeeBook;

    public SalaryImpl(EmployeeBook employeeBook) {
        this.employeeBook = employeeBook;
    }

    public int getSalary(Map<String, Employee> employees) {
        return sumSalary(employees);
    }

    @Override
    public void updateSalary(Map<String, Employee> emp, int index) {
        employeeBook.updateSalary(emp, 1 + (index / 100f));
    }

    private int sumSalary(Map<String, Employee> employees) {
        Collection<Employee> emp = employees.values();
        int sum = 0;

        for (Employee employee : emp) {
            sum += employee.getSalary();
        }

        return sum;
    }

    @Override
    public Employee getEmployeeMinSalary(Map<String, Employee> employees) {
        Employee empMinSalary = null;

        for (Employee employee : employees.values()) {
            if (empMinSalary == null) {
                empMinSalary = employee;
            } else {
                if (employee.getSalary() < empMinSalary.getSalary()) {
                    empMinSalary = employee;
                }
            }
        }
        return empMinSalary;
    }

    @Override
    public Employee getEmployeeMaxSalary(Map<String, Employee> employees) {
        Employee empMaxSalary = null;

        for (Employee employee : employees.values()) {
            if (empMaxSalary == null) {
                empMaxSalary = employee;
            } else {
                if (employee.getSalary() > empMaxSalary.getSalary()) {
                    empMaxSalary = employee;
                }
            }
        }
        return empMaxSalary;
    }

    @Override
    public int getAverageSalary(Map<String, Employee> employees) {
        int sum = sumSalary(employees);
        return sum / employees.size();
    }
}
