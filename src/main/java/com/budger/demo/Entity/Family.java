package com.budger.demo.Entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Family")
public class Family {
    @Id
    @SequenceGenerator(
            name = "family_sequence",
            sequenceName = "family_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "family_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(name = "family_name")
    private  String family_name;

    public Family(Long id, String family_name) {
        this.id = id;
        this.family_name = family_name;
    }

    public Family() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", family_name='" + family_name + '\'' +
                '}';
    }
}
