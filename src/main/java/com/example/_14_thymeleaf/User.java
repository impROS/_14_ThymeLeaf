package com.example._14_thymeleaf;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("***** User Details *****\n");
        sb.append("Email=" + getEmail() + "\n");
        sb.append("Password=" + getPassword() + "\n");
        sb.append("*****************************");

        return sb.toString();
    }
}
