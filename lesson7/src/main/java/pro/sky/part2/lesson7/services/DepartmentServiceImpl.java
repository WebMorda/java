package pro.sky.part2.lesson7.services;

import org.springframework.stereotype.Service;
import pro.sky.part2.lesson7.data.Employee;

import java.util.List;
import java.util.stream.Collectors;

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
        return salary.getEmployeeMinSalary(getEmployeeByDepartmentId(departmentId));
    }

    @Override
    public Employee getEmployeeMaxSalaryInDepartment(int departmentId) {
        return salary.getEmployeeMaxSalary(getEmployeeByDepartmentId(departmentId));
    }

    @Override
    public double getAverageSalary(int departmentId) {
        return salary.getAverageSalary(getEmployeeByDepartmentId(departmentId));
    }

    @Override
    public double getSalaryDepartment(int departmentId) {
        return salary.getSalary(getEmployeeByDepartmentId(departmentId));
    }

    @Override
    public List<Employee> getEmployeeByDepartmentId(int departmentId) {
        return getEmployees(departmentId);
    }

    private List<Employee> getEmployees(int departmentId) {
        return employeeBook.getAllEmployee().stream()
                .filter((employee -> employee.getDepartment() == departmentId))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> printEmployeeByDepartmentId(int departmentId){
        return prepareEmployDepartmentPrint(getEmployees(departmentId));
    }

    private List<String> prepareEmployDepartmentPrint(List<Employee> emp) {
        return emp.stream().map((e) -> e.getFullname() + " " + e.getSalary()).toList();
    }
}