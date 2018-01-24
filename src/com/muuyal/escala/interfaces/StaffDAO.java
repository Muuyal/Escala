package com.muuyal.escala.interfaces;

import java.util.List;
import com.muuyal.escala.staff.Staff;

public interface StaffDAO {
    public void registrar(Staff staff) throws Exception;
    public void modificar(Staff staff) throws Exception;
    public void eliminar(Staff staff) throws Exception;
    public List<Staff> listar() throws Exception;
}
