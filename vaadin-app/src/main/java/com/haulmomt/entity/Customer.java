package com.haulmomt.entity;

import javax.persistence.*;
import javax.persistence.Entity;
//import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by MRSMITH on 21.08.2017.
 */

@Entity
@javax.persistence.Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

@Column(name = "Name")
    private  String name="";

    @Column(name = "Lastname")
    private  String lastname="";

    @Column(name = "Patronymic")
    private  String paronymic="";

    @Column(name = "Phonenumber")
    private  String phonenumber="";


    @OneToMany(mappedBy = "Customer")
    private Set<Order> orders = new HashSet<>();

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getParonymic() {
        return paronymic;
    }

    public void setParonymic(String paronymic) {
        this.paronymic = paronymic;
    }

    public String getPhoneNumber() {
        return phonenumber;
    }

    public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return this.name+" "+this.lastname;
    }

}
