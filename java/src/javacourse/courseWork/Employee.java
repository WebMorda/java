package javacourse.courseWork;

public class Employee {
    private static int counter;

    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private float salary;

    public Employee (String firstName,
                     String lastName,
                     String middleName,
                     int department,
                     float salary){
        this.id = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    //region get
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public String getFullName(){
        return String.format("%s %s %s", lastName, firstName, middleName);
    }

    //endregion

    //region set

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    //endregion

    //region Override
    @Override
    public String toString(){
        return String.format("Id: %s | Фамилия: %s | Имя: %s | Отчество: %s | Отдел: %s | Зарплата: %s | " +
                "\n----------------------------------------------------------------------------------------\n",
                id, lastName, firstName, middleName, department, salary);
    }
    //endregion
}
