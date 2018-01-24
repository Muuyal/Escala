package com.muuyal.escala.interfaces;

import com.muuyal.escala.user.User;
import java.util.List;

public interface UserDAO {
    public void registrar(User user) throws Exception;
    public void modificar(User user) throws Exception;
    public void eliminar(User user) throws Exception;
    public List<User> listar() throws Exception;
}
