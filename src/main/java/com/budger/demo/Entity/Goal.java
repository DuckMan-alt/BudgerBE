package com.budger.demo.Entity;

import java.sql.Timestamp;

public class Goal {
    private Long id;
    private Integer budget_id;
    private String title;
    private Integer value;
    private String description;
    private Timestamp date;

    public Goal(Long id,
                Integer budget_id,
                String title,
                Integer value,
                String description,
                Timestamp date) {
        this.id = id;
        this.budget_id = budget_id;
        this.title = title;
        this.value = value;
        this.description = description;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBudget_id() {
        return budget_id;
    }

    public void setBudget_id(Integer budget_id) {
        this.budget_id = budget_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "id=" + id +
                ", budget_id=" + budget_id +
                ", title='" + title + '\'' +
                ", value=" + value +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
