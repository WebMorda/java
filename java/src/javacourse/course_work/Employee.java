package javacourse.course_work;

public class Employee {
    private static int Id;

    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;

    public Employee (String firstName,
                     String lastName,
                     String middleName,
                     int department,
                     int salary){
        this.id = ++Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public Employee(){}

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

    public int getSalary() {
        return salary;
    }

    public String getFIO(){
        return String.format("%s %s %s", lastName, firstName, middleName);
    }

    public String getDepartmentName(int id){
        switch (id){
            case 1:
                return "Поэзия";
            case 2:
                return "Акмеизм";
            case 3:
                return "Проза";
            case 4:
                return "Футуризм";
            default:
                return "";
        }
    }
    //endregion

    //region set

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //endregion

    //region Override
    @Override
    public String toString(){
        return String.format("Id: %s | Фамилия: %s | Имя: %s | Отчество: %s | Отдел: %s | Зарплата: %s | " +
                "\n----------------------------------------------------------------------------------------\n",
                id, lastName, firstName, middleName, getDepartmentName(department), salary);
    }
    //endregion
}
