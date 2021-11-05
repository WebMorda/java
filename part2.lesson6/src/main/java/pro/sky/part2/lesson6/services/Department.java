package pro.sky.part2.lesson6.services;

import pro.sky.part2.lesson6.data.Employee;

public interface Department {
    Employee getEmployeeMinSalaryInDepartment(int departmentId);
    Employee getEmployeeMaxSalaryInDepartment(int departmentId);
    float getAverageSalary(int departmentId);
    float getSalaryDepartment(int departmentId);
}
