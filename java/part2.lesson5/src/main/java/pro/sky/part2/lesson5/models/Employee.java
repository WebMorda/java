package pro.sky.part2.lesson5.models;

public class Employee {
    private final String firstName;
    private final String lastName;

    public Employee (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString(){
        return String.format("Фамилия: %s | Имя: %s\n",
                lastName, firstName);
    }

    @Override
    public boolean equals(Object employee){
        if (this.getClass() != employee.getClass()){
            return false;
        }

        Employee emp = (Employee)employee;
        String fullName = firstName + " " + lastName;
        String fullName1 = emp.firstName + " " + emp.lastName;
        return fullName.equals(fullName1);
    }
}
