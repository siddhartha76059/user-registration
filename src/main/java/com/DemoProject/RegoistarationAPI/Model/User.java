package com.DemoProject.RegoistarationAPI.Model;

import javax.persistence.*;

@Entity
@Table(name = "userRegistration")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
    public String address;
    public String dob;
    public String gender;

    public User() {
    }

    public User(String name, String address, String dob, String gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
