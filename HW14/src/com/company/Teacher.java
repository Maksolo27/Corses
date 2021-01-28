package com.company;

public class Teacher {
    private String firstname, lastname;

    public Teacher(String lastname, String firstname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
