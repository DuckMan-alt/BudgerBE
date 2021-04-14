package com.budger.demo.Entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "UserRole")
@Table(
        name = "user_role",
        uniqueConstraints = {
                @UniqueConstraint(name = "title_unique", columnNames = "title")
        }
)
public class UserRole {
    @Id
    @SequenceGenerator(
            name = "userRole_sequence",
            sequenceName = "userRole_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "userRole_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "title",
            nullable = false
    )
    private String title;

    public UserRole(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public UserRole() {

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
