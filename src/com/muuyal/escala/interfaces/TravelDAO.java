package com.muuyal.escala.interfaces;

import java.util.List;
import com.muuyal.escala.travel.Travel;

public interface TravelDAO {
    
    public void registrar(Travel travel) throws Exception;
    public void modificar(Travel travel) throws Exception;
    public void eliminar(Travel travel) throws Exception;
    public List<Travel> listar() throws Exception;
    
}
