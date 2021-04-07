package com.budger.demo.Entity;

public class FamilyAccount {
    private Integer account_id;
    private Integer family_id;

    public FamilyAccount(Integer account_id,
                         Integer family_id) {
        this.account_id = account_id;
        this.family_id = family_id;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public Integer getFamily_id() {
        return family_id;
    }

    public void setFamily_id(Integer family_id) {
        this.family_id = family_id;
    }

    @Override
    public String toString() {
        return "FamilyAccount{" +
                "account_id=" + account_id +
                ", family_id=" + family_id +
                '}';
    }
}
