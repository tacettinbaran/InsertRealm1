package com.example.insertrealm1;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class PersonsTable extends RealmObject {

    private String personName;
    private String personSurname;
    private Integer personSalary;
    private Integer personAge;

    @Override
    public String toString() {
        return "PersonsTable{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personSalary=" + personSalary +
                ", personAge=" + personAge +
                '}';
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public Integer getPersonSalary() {
        return personSalary;
    }

    public void setPersonSalary(Integer personSalary) {
        this.personSalary = personSalary;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }
}
