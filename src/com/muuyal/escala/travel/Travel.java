package com.muuyal.escala.travel;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Travel{

    DateFormat date = new SimpleDateFormat("DD/MM/YYYY");

    private Integer id;
    private String name;
    private String destination;
    private String departure;
    private String deadline;
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

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
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

    public Integer getId() { 
        return id; 
    }

    public void setId(Integer id) { 
        this.id = id; 
    }
}