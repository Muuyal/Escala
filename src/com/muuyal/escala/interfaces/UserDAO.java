package com.muuyal.escala.interfaces;

import com.muuyal.escala.user.User;
import java.util.List;

public interface UserDAO {

    public void save(User user) throws Exception;
    public void update(User user) throws Exception;
    public void delete(User user) throws Exception;
    public List<User> findAll() throws Exception;
}
