package javacourse.course_work;

import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees = new Employee[15];
    private Employee emp = new Employee();

    public EmployeeBook() {
        addEmployeeToArray(employees);
    }

    public void printDepartmentEmployee() {
        Employee[] employee = Arrays.stream(employees).filter(e -> e != null).toArray(Employee[]::new);

        for (int i = 1; i <= 4; i++) {
            final int id = i;
            System.out.println(emp.getDepartmentName(id));
            printEmployeeDepartment(Arrays.stream(employee).filter(e -> e.getDepartment() == id).toArray(Employee[]::new));
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.printf("\nНовый сотрудник\n%s", employees[i]);
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        System.out.printf("\nКоличество сотрудников %s\n", Arrays.stream(employees).filter(e -> e != null).count());
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
        System.out.printf("\nКоличество сотрудников %s\n", Arrays.stream(employees).filter(e -> e != null).count());
    }

    public void editEmployee(String fistName, String lastName, String middleName, int departmentId, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFirstName() == fistName && employee.getLastName() == lastName && employee.getMiddleName() == middleName) {
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

    public Employee[] getEmployees() {
        return employees;
    }

    public void printSmallSalary(Employee[] employees, int smallSalary) {
        Employee[] smallSalaryEmployee = Arrays.stream(employees).filter(e -> e != null && e.getSalary() < smallSalary).toArray(Employee[]::new);

        printEmployeeDepartment(smallSalaryEmployee);
    }

    public void printMoreSalary(Employee[] employees, int smallSalary) {
        Employee[] smallSalaryEmployee = Arrays.stream(employees).filter(e -> e != null && e.getSalary() >= smallSalary).toArray(Employee[]::new);

        printEmployeeDepartment(smallSalaryEmployee);
    }

    public Employee[] getEmployeesDepartment(Employee[] employees, int idDepartment) {
        return Arrays.stream(employees).filter(e -> e != null && e.getDepartment() == idDepartment).toArray(Employee[]::new);
    }

    public void printEmployeeDepartment(Employee[] employeesDepartment) {
        for (Employee employee : employeesDepartment) {
            System.out.printf("\nId: %s | Фамилия: %s | Имя: %s | Отчество: %s | Зарплата: %s | " +
                            "\n----------------------------------------------------------------------------------------\n",
                    employee.getId(), employee.getLastName(), employee.getFirstName(), employee.getMiddleName(), employee.getSalary());
        }
    }

    public void indexSalary(Employee[] employees, float index) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary((int) (employee.getSalary() * index));
            }
        }
    }

    public void printFIO(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFIO());
            }
        }
    }

    public void printMinMaxSalary(Employee[] employees) {

        Employee minSalary = employees[0];
        Employee maxSalary = employees[0];

        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary.getSalary()) {
                    minSalary = employee;
                }
                if (employee.getSalary() > maxSalary.getSalary()) {
                    maxSalary = employee;
                }
            }
        }

        System.out.printf("\nСотрудник с минимальной зарплатой" +
                "\n%s\n", minSalary);
        System.out.printf("\nСотрудник с максимальной зарплатой" +
                "\n%s\n", maxSalary);
    }

    public void printSum(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }

        System.out.printf("\nСумма затрат на зарплату в месяц: %s \n", sum);

        int employeeCount = (int) Arrays.stream(employees).filter(e -> e != null).count();

        System.out.printf("\nСредняя зарплата: %s \n", (sum / employeeCount));
    }

    public void printEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
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
