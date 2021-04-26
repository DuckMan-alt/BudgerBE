package com.budger.demo.Entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Account")
@Table(
        name = "account",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email")
        }
)
public class Account {
    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "account_sequence"
    )
    @Column(
            name = "id",
            updatable = false,
            nullable = false
    )
    private  Long id;

    @OneToOne(
            fetch = FetchType.EAGER,
            mappedBy = "account",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}
    )
    private PersonalInfo personalInfo;


    @Column(
            name = "username",
            nullable = false
    )
    private String username;

    @Column(
            name = "email",
            nullable = false
    )
    private String email;

    @Column(
            name = "password",
            nullable = false
    )
    private Integer password;

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    @ManyToOne
    @JoinColumn(
            name = "account_role",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "account_role_fk"
            )
    )
    private UserRole account_role;

    public Account() {
    }

    public Account(
                   String username,
                   String email,
                   Integer password
                  ) {
        this.username = username;
        this.email = email;
        this.password = password;
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

    public UserRole getAccount_role() {
        return account_role;
    }

    public void setAccount_role(UserRole account_role) {
        this.account_role = account_role;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", account_role=" + account_role +
                '}';
    }
}
