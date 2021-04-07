package com.budger.demo.Entity;

public class Budget {
    private Long id;

    public Budget(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                '}';
    }
}
