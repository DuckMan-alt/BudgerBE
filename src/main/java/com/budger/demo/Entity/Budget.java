package com.budger.demo.Entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Budget")
public class Budget {
    @Id
    @SequenceGenerator(
            name = "budget_sequence",
            sequenceName = "budget_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "budget_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    public Budget(Long id) {
        this.id = id;
    }

    public Budget() {

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
