package com.budger.demo.Entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Category")
public class Category {
    @Id
    @SequenceGenerator(
            name = "category_sequence",
            sequenceName = "category_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "category_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "categor_name",
            nullable = false,
            unique = true
    )
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
