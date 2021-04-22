package com.budger.demo.Entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
            updatable = false,
            nullable = false
    )
    private Long id;
    @Column(
            name = "title",
            nullable = false
    )
    private String title;

    @OneToMany(
            mappedBy = "account_role",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST,CascadeType.REMOVE}
    )
    private List<Account> accounts = new ArrayList<>();

    public UserRole(String title) {
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

    public void removeAccount(Account account){
        if(!this.accounts.contains(account)){
            this.accounts.remove(account);
            account.setAccount_role(null);
        }
    }

    public void addAccount(Account account){
        if(!this.accounts.contains(account)){
            this.accounts.add(account);
            account.setAccount_role(this);
        }
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
