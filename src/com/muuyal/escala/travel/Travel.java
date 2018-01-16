package com.muuyal.escala.travel;

import java.util.Date;

public class Travel{

    private Integer id;
    private String name;
    private String destination;
    private Date departure;
    private Date deadline;
    private Integer price;
    private Integer payments;

    public Travel(Integer id, String name, String destination, Integer price) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPayments() {
        return payments;
    }

    public void setPayments(Integer payments) {
        this.payments = payments;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }
}