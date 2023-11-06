package ru.arapov.helperproject.models;

import java.util.Set;

public class RegistrationDTO {

    public RegistrationDTO() {
        super();
    }

    public RegistrationDTO(String username, String password, Integer age, String email) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    private String username;

    private String password;

    private Integer age;

    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Registration info: " + "username = '" + username + ", password = '" + password + ", age = " + age +
                ", email = '" + email;
    }
}
