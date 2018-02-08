package com.muuyal.escala.interfaces;

import java.util.List;
import com.muuyal.escala.travel.Travel;

public interface TravelDAO {
    
    public void save(Travel travel) throws Exception;
    public void update(Travel travel) throws Exception;
    public void delete(Travel travel) throws Exception;
    public List<Travel> findAll() throws Exception;
    
}
