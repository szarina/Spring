package com.example.task1.user.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class AuthRequest {
    @NotNull @Email @Length(min = 5, max = 50)
    private String email;

    @NotNull @Length(min = 5, max = 10)
    private String password;

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


}