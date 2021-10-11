package javacourse.lesson9;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
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
    public String toString() {
        return "Author: " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }

        Author a2 = (Author) object;
        String fullName = this.firstName + " " + this.lastName;
        String fullName2 = a2.firstName + " " + a2.lastName;
        return fullName.equals(fullName2);
    }

    @Override
    public int hashCode() {
        String fullName = this.firstName + " " + this.lastName;

        return Objects.hash(fullName);
    }
}
