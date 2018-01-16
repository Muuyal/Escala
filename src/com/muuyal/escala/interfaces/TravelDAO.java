package com.muuyal.escala.interfaces;

import java.util.List;
import com.muuyal.escala.travel.Travel;
public interface TravelDAO {
    
    public void registrar(Travel trav) throws Exception;
    public void modificar(Travel trav) throws Exception;
    public void eliminar(Travel trav) throws Exception;
    public List<Travel> listar() throws Exception;
    
}
