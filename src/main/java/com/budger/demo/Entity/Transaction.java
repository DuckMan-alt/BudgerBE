package com.budger.demo.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "Transaction")
public class Transaction {

    private Integer budget_id;

    private Integer category_id;

    @Column(
            name = "value",
            nullable = false
            //Money
    )
    private Integer value;

    @Column(
            name = "date",
            nullable = false
    )
    private Timestamp date;

    public Transaction(Integer budget_id, Integer category_id, Integer value, Timestamp date) {
        this.budget_id = budget_id;
        this.category_id = category_id;
        this.value = value;
        this.date = date;
    }

    public Integer getBudget_id() {
        return budget_id;
    }

    public void setBudget_id(Integer budget_id) {
        this.budget_id = budget_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "budget_id=" + budget_id +
                ", category_id=" + category_id +
                ", value=" + value +
                ", date=" + date +
                '}';
    }
}
