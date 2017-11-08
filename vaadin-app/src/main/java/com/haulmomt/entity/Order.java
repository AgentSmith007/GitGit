package com.haulmomt.entity;

import com.haulmomt.OrderStatus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Statement;

/**
 * Created by MRSMITH on 21.08.2017.
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Long id;

    @ManyToOne()
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private  Customer customer;

    @Column(name = "description")
    private  String description="";

    @Column(name = "createdate")
    private Date createDate;

    @Column(name = "finishdate")
    private  Date finishDate;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "statement")
    private OrderStatus orderStatus;


    public Order(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }






    @Override
    public String toString() {
        return  "Order " + this.id +" ,"+ this.description + ", " + this.getCost().toString()+", "+ this.getOrderStatus().toString();
    }
}
