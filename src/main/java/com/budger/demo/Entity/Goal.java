package com.budger.demo.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Goal")
public class Goal {
    @Id
    @SequenceGenerator(
            name = "goal_sequence",
            sequenceName = "goal_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "goal_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "budget_id",
            nullable = false
    )
    private Integer budget_id;

    @Column(name = "title")
    private String title;

    @Column(
            name = "value",
            nullable = false
            //Money
    )
    private Integer value;
    @Column(name = "description",
            columnDefinition = "TEXT"
    )
    private String description;

    @Column(name = "date")
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
