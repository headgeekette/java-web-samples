package com.sample.bean;

import java.util.Date;

public class Employee implements java.io.Serializable {

    private Integer id;
    private Date birthday;
    private String firstName;
    private String lastName;
    private String gender;
    private Date hireDate;
    private String fullName;


    public Employee() {
    }

    public Employee(Integer id, Date birthday, String firstName, String lastName, String gender, Date hireDate) {
        this.id = id;
        this.birthday = birthday;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    // public void setFullName(String fullName) {
    //     this.fullName = fullName;
    // }

        
    
}
