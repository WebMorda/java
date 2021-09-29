package javacourse.courseWork;

import java.util.Arrays;
import java.util.Objects;

public class EmployeeBook {
    private Employee[] employees = new Employee[15];

    public EmployeeBook() {
        addEmployeeToArray(employees);
    }

    public void printDepartmentEmployee() {
        for (int i = 1; i <= 4; i++) {
            final int id = i;
            System.out.println("Отдел №" + id);
            printShortEmployee(getEmployeesDepartment(id));
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.printf("\nНовый сотрудник\n%s", employees[i]);
                return;
            }
        }
        System.out.println("Ошибка! Нет свободного места, сотрудник не был добавлен!");
    }

    public void deleteEmployee(int id) {
        System.out.printf("\nКоличество сотрудников %s\n", Arrays.stream(employees).filter(Objects::nonNull).count());
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
        System.out.printf("\nКоличество сотрудников %s\n", Arrays.stream(employees).filter(Objects::nonNull).count());
    }

    public void editEmployee(String fistName, String lastName, String middleName, int departmentId, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFirstName().equals(fistName) && employee.getLastName().equals(lastName) && employee.getMiddleName().equals(middleName)) {
                System.out.println(employee);

                if (departmentId != 0) {
                    employee.setDepartment(departmentId);
                }
                if (salary != 0) {
                    employee.setSalary(salary);
                }
                System.out.println(employee);
            }
        }
    }

    public void printSmallSalary(int smallSalary) {
        Employee[] smallSalaryEmployee = Arrays.stream(employees).filter(e -> e != null && e.getSalary() < smallSalary).toArray(Employee[]::new);

        printShortEmployee(smallSalaryEmployee);
    }

    public void printMoreSalary(int smallSalary) {
        Employee[] smallSalaryEmployee = Arrays.stream(employees).filter(e -> e != null && e.getSalary() >= smallSalary).toArray(Employee[]::new);

        printShortEmployee(smallSalaryEmployee);
    }

    public Employee[] getEmployeesDepartment(int departmentId) {
        return Arrays.stream(employees).filter(e -> e != null && e.getDepartment() == departmentId).toArray(Employee[]::new);
    }

    public void printEmployeeDepartment(int departmentId) {
        Employee[] departmentEmployees = getEmployeesDepartment(departmentId);

        if (departmentEmployees != null) {
            printShortEmployee(departmentEmployees);
        } else {
            System.out.println("В отделе нет сотрудников, или данного отдела не существует!");
        }
    }

    public void indexAllSalary(int index) {
        indexSalary(index, employees);
    }

    public void indexDepartmentSalary(int index, int departmentId) {
        Employee[] emp;
        emp = getEmployeesDepartment(departmentId);

        indexSalary(index, emp);
    }

    public void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public Employee printAllMinSalary() {
        Employee minSalary = employees[0];

        for (Employee employee : employees) {
            if (employee != null && (employee.getSalary() < minSalary.getSalary())) {
                minSalary = employee;
            }
        }
        printEmployee(minSalary);

        return minSalary;
    }

    public Employee printAllMaxSalary() {
        Employee maxSalary = employees[0];

        for (Employee employee : employees) {
            if (employee != null && (employee.getSalary() > maxSalary.getSalary())) {
                maxSalary = employee;
            }
        }

        printEmployee(maxSalary);

        return maxSalary;
    }

    public Employee printDepartmentMaxSalary(int departmentId) {
        Employee[] emp = getEmployeesDepartment(departmentId);
        Employee maxSalary = emp[0];

        for (Employee employee : emp) {
            if (employee != null && (employee.getSalary() > maxSalary.getSalary())) {
                maxSalary = employee;
            }
        }

        printEmployee(maxSalary);

        return maxSalary;
    }

    public void printDepartmentMinSalary(int departmentId) {
        Employee[] emp = getEmployeesDepartment(departmentId);

        Employee minSalary = emp[0];

        for (Employee employee : emp) {
            if (employee != null && (employee.getSalary() < minSalary.getSalary())) {
                minSalary = employee;
            }
        }

        printEmployee(minSalary);
    }

    public void printAllEmployeeSum() {
        int sum = getSum(employees);

        averageSalary(sum, employees);
    }

    public void printDepartmentSum(int departmentId) {
        Employee[] emp = getEmployeesDepartment(departmentId);

        int sum = getSum(emp);

        averageSalary(sum, emp);
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private void averageSalary(int sum, Employee[] emp) {
        int employeeCount = (int) Arrays.stream(emp).filter(Objects::nonNull).count();

        System.out.printf("\nСредняя зарплата: %s \n", (sum / employeeCount));
    }

    private int getSum(Employee[] emp) {
        int sum = 0;

        for (Employee employee : emp) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }

        System.out.printf("\nСумма затрат на зарплату в месяц: %s \n", sum);
        return sum;
    }

    public void printEmployee(Employee salary) {
        System.out.printf("\n%s\n", salary);
    }

    private void printShortEmployee(Employee[] e) {
        for (Employee employee : e) {
            System.out.printf("\nId: %s | Фамилия: %s | Имя: %s | Отчество: %s | Зарплата: %s | " +
                            "\n----------------------------------------------------------------------------------------\n",
                    employee.getId(), employee.getLastName(), employee.getFirstName(), employee.getMiddleName(), employee.getSalary());
        }
    }

    private void indexSalary(int index, Employee[] emp) {
        float percent = (1 + (index / 100f));
        for (Employee employee : emp) {
            employee.setSalary((employee.getSalary() * percent));
        }
    }

    private void addEmployeeToArray(Employee[] employees) {
        employees[0] = new Employee("Аркадий", "Аверченко", "Тимофеевич", 3, 100);
        employees[1] = new Employee("Корней", "Чуковский", "Иванович", 3, 130);
        employees[2] = new Employee("Иван", "Бунин", "Алексеевич", 3, 90);
        employees[3] = new Employee("Владимир", "Маяковский", "Владимирович", 4, 80);
        employees[4] = new Employee("Анна", "Ахматова", "Андреевна", 2, 115);
        employees[5] = new Employee("Осип", "Мандельштам", "Эмильевич", 2, 105);
        employees[6] = new Employee("Александр", "Блок", "Александрович", 1, 95);
        employees[7] = new Employee("Зинаида", "Гиппиус", "Николаевна", 1, 110);
        employees[8] = new Employee("Фёдор", "Сологуб", "Кузьмич", 1, 75);
        employees[9] = new Employee("Иннокентий", "Анненский", "Фёдорович", 1, 85);
    }
}
