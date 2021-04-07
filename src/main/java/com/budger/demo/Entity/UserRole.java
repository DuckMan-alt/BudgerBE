package com.budger.demo.Entity;

public class UserRole {
    private Long id;
    private String title;

    public UserRole(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
