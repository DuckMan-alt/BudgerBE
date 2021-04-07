package com.budger.demo.Entity;

public class Family {
    private Long id;
    private  String family_name;

    public Family(Long id, String family_name) {
        this.id = id;
        this.family_name = family_name;
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
