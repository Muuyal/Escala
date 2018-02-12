package com.muuyal.escala.interfaces;

import java.util.List;
import com.muuyal.escala.passenger.Passenger;

public interface PassengersDAO {

    public void save(Passenger passenger) throws Exception;
    public void update(Passenger passenger) throws Exception;
    public void delete(Passenger passenger) throws Exception;
    public List<Passenger> findAll() throws Exception;
    public List<Passenger> findAll(String search) throws Exception;
}
