package model;

public class Author{

    public String firstName;
    public String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Author: " +
                "First Name: " + firstName + '\'' +
                ", Last Name: '" + lastName + '\'';
    }
}
