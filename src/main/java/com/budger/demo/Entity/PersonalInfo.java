package com.budger.demo.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Optional;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "PersonalInfo")
@Table(name ="personal_info")
public class PersonalInfo {

    @Id
    @SequenceGenerator(
            name = "personal_info_sequence",
            sequenceName = "personal_info_sequence",
            schema = "public",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "card_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Integer id;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(
            name = "account_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "personal_info_to_account_id_fk"
            )
    )
    private Account account;


    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "birthday_date")
    private Date birthday_date;

    public PersonalInfo() {
    }

    public PersonalInfo(String first_name, String last_name, Date birthday_date) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday_date = birthday_date;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirthday_date() {
        return birthday_date;
    }

    public void setBirthday_date(Date birthday_date) {
        this.birthday_date = birthday_date;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "id=" + id +
                ", account=" + account +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday_date=" + birthday_date +
                '}';
    }
}
