package com.budger.demo.Entity;

import javax.persistence.*;
import java.sql.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "PersonalInfo")
public class PersonalInfo {
    @Id
    @Column(
            name = "id",
            updatable = false
    )
    private Integer account_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "birthday_date")
    private Date birthday_date;

    public PersonalInfo(Integer account_id,
                        String first_name,
                        String last_name,
                        Date birthday_date) {
        this.account_id = account_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday_date = birthday_date;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
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
                "account_id=" + account_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday_date=" + birthday_date +
                '}';
    }
}
