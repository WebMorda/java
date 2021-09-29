package javacourse.courseWork;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees();
        separator();
        employeeBook.printAllEmployeeSum();
        separator();
        employeeBook.printAllMinSalary();
        separator();
        employeeBook.printAllMaxSalary();
        separator();
        employeeBook.printFullNames();
        separator();
        employeeBook.indexAllSalary(10);
        separator();
        employeeBook.printDepartmentMaxSalary(2);
        separator();
        employeeBook.printDepartmentMinSalary(2);
        separator();
        employeeBook.printDepartmentSum(1);
        separator();
        employeeBook.indexDepartmentSalary(20, 2);
        separator();
        employeeBook.printEmployeeDepartment(1);
        separator();
        employeeBook.printSmallSalary(110);
        separator();
        employeeBook.printMoreSalary(110);
        separator();
        employeeBook.addEmployee(new Employee("Валерий", "Брюсов", "Яковлевич", 1, 115));
        separator();
        employeeBook.deleteEmployee(5);
        separator();
        employeeBook.editEmployee("Иван", "Бунин", "Алексеевич", 0, 111);
        separator();
        employeeBook.printDepartmentEmployee();
    }

    private static void separator() {
        System.out.println("============================================================================================");
    }
}