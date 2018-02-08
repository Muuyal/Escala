package com.muuyal.escala.dao;

import com.muuyal.escala.interfaces.UserDAO;
import com.muuyal.escala.user.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends Conexion implements UserDAO {

    @Override
    public void save(User user) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("INSERT INTO \"Escala\".\"user\"(\n" +
                    "\t\"userID\", password, rol) VALUES (?, ?, ?);");
            statementSQL.setString(1, user.getUserID());
            statementSQL.setString(2, user.getPassword());
            statementSQL.setString(3, user.getRol());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void update(User user) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("UPDATE \"Escala\".\"user\"\n" +
                    "\tSET \"userID\"=?, password=?, rol=? WHERE \"userID\"=?;");
            statementSQL.setString(1, user.getUserID());
            statementSQL.setString(2, user.getPassword());
            statementSQL.setString(3, user.getRol());
            statementSQL.setString(4, user.getUserID());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void delete(User user) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("DELETE FROM \"Escala\".\"user\"\n" +
                    "\tWHERE \"userID\"=?;");
            statementSQL.setString(1, user.getUserID());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public List<User> findAll() throws Exception {
        List<User> lista = null;
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("SELECT * FROM \"Escala\".user");

            lista = new ArrayList();
            ResultSet statementSQL2 = statementSQL.executeQuery();
            while(statementSQL2.next()){
                User user = new User("","");

                user.setUserID(statementSQL2.getString("userID"));
                user.setPassword(statementSQL2.getString("password"));
                user.setRol(statementSQL2.getString("rol"));
                lista.add(user);
            }
            statementSQL2.close();
            statementSQL.close();

        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }
}
