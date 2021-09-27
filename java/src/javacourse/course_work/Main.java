package javacourse.course_work;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        Employee[] employees = employeeBook.getEmployees();

        employeeBook.printEmployee(employees);

        employeeBook.printSum(employees);

        employeeBook.printMinMaxSalary(employees);

        employeeBook.printFIO(employees);

        employeeBook.indexSalary(employees, 1.1f);

        Employee[] employeesDepartment = employeeBook.getEmployeesDepartment(employees, 1);

        employeeBook.printMinMaxSalary(employeesDepartment);

        employeeBook.printSum(employeesDepartment);

        employeeBook.indexSalary(employeesDepartment, 1.2f);

        employeeBook.printEmployeeDepartment(employeesDepartment);
        System.out.println("=======================================================================");
        employeeBook.printSmallSalary(employees, 110);
        System.out.println("=======================================================================");
        employeeBook.printMoreSalary(employees, 110);

        employeeBook.addEmployee(new Employee("Валерий", "Брюсов", "Яковлевич", 1, 115));

        employeeBook.deleteEmployee(5);

        employeeBook.editEmployee("Иван", "Бунин", "Алексеевич", 0, 111);

        employeeBook.printDepartmentEmployee();
    }
}