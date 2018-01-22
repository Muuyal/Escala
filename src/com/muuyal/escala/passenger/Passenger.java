package com.muuyal.escala.passenger;

import java.*;

public class Passenger {

    private Integer id;
    private String name;
    private String travel;
    private String phone;
    private String eMail;
    private String addressStreet;
    private String addressCity;
    private String addressColony;
    private Integer addressPC;
    private String notes;

    public Passenger(String name, String travel, String phone, String eMail) {
        this.name = name;
        this.travel = travel;
        this.phone = phone;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
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

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressColony() {
        return addressColony;
    }

    public void setAddressColony(String addressColony) {
        this.addressColony = addressColony;
    }

    public Integer getAddressPC() {
        return addressPC;
    }

    public void setAddressPC(Integer addressPC) {
        this.addressPC = addressPC;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}