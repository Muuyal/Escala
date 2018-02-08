package com.muuyal.escala.interfaces;

import java.util.List;
import com.muuyal.escala.staff.Staff;

public interface StaffDAO {

    public void save(Staff staff) throws Exception;
    public void update(Staff staff) throws Exception;
    public void delete(Staff staff) throws Exception;
    public List<Staff> findAll() throws Exception;
}
