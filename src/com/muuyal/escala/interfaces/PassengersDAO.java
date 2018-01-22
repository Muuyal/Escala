package com.muuyal.escala.interfaces;

import java.util.List;
import com.muuyal.escala.passenger.Passenger;

public interface PassengersDAO {

    public void registrar(Passenger passenger) throws Exception;
    public void modificar(Passenger passenger) throws Exception;
    public void eliminar(Passenger passenger) throws Exception;
    public List<Passenger> listar() throws Exception;
}
