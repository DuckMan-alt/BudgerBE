package com.budger.demo.Entity;

public class Category {
    private Long id;
    private String categor_name;

    public Category(Long id, String categor_name) {
        this.id = id;
        this.categor_name = categor_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategor_name() {
        return categor_name;
    }

    public void setCategor_name(String categor_name) {
        this.categor_name = categor_name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categor_name='" + categor_name + '\'' +
                '}';
    }
}
