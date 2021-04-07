package com.budger.demo.Entity;

public class Account {
    private  Long id;
    private String username;
    private String email;
    private Integer password;
    private Integer account_role;

    public Account(Long id,
                   String username,
                   String email,
                   Integer password,
                   Integer account_role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.account_role = account_role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getAccount_role() {
        return account_role;
    }

    public void setAccount_role(Integer account_role) {
        this.account_role = account_role;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", account_role=" + account_role +
                '}';
    }
}
