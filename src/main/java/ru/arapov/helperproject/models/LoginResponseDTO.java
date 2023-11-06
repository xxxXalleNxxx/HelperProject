package ru.arapov.helperproject.models;

public class LoginResponseDTO {

    private User user;
    private String password;

    public LoginResponseDTO() {
        super();
    }

    public LoginResponseDTO(User user, String password) {
        this.user = user;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
