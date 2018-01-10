package com.muuyal.escala.travel;

import java.util.Date;


public class Travel{

    private String name;
    private String destination;
    private Date departure;
    private Date deadline;
    private Integer price;
    private Integer payments;
    private Integer numPay;

    Travel (String name, String destination, Date departure, Integer price){
        this.setName(name);
        this.setDestination(destination);
        this.setDeparture(departure);
        this.setPrice(price);
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

    public Integer getNumPay() {
        return numPay;
    }

    public void setNumPay(Integer numPay) {
        this.numPay = numPay;
    }

}