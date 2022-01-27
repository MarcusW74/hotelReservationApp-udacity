package model;

import java.util.regex.Pattern;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String emailRegex = "^(.+)@(.+)\\.(.+)$";  //Not sure about this Regex

    public Customer(String firstName, String lastName, String email) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailRegex() {
        return emailRegex;
    }

    private final Pattern pattern = Pattern.compile(emailRegex);

    public String Customer(String email) {
        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email address");
        }
        return email;
    }
        @Override
        public String toString() {
            return "Customer Name: " + firstName + " " + lastName + " Email: " + email;
        }
    }

