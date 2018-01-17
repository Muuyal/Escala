package com.muuyal.escala.dao;

import com.muuyal.escala.interfaces.TravelDAO;
import com.muuyal.escala.travel.Travel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TravelDAOImpl extends Conexion implements TravelDAO {

    @Override
    public void registrar(Travel travel) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("INSERT INTO travel (id, name, destination, departure, deadline, price, payments) VALUES (?, ?, ?, ?, ?, ?, ?)");
            statementSQL.setInt(1, travel.getId());
            statementSQL.setString(2, travel.getName());
            statementSQL.setString(3, travel.getDestination());
            statementSQL.setDate(4, travel.getDeparture());
            statementSQL.setDate(5, travel.getDeadline());
            statementSQL.setInt(6, travel.getPrice());
            statementSQL.setInt(7, travel.getPayments());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Travel travel) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("UPDATE travel SET departure = ?, deadline = ?, payments = ? WHERE ID = ?");
            statementSQL.setDate(1, travel.getDeparture());
            statementSQL.setDate(2, travel.getDeadline());
            statementSQL.setInt(3, travel.getPayments());
            statementSQL.setInt(4, travel.getId());
            statementSQL.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Travel travel) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("DELETE FROM travel WHERE id = ?");
            statementSQL.setInt(1, travel.getId());
            statementSQL.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Travel> listar() throws Exception {
        List<Travel> lista = null;
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("SELECT * FROM travel");

            lista = new ArrayList();
            ResultSet statementSQL2 = statementSQL.executeQuery();
            while(statementSQL2.next()){
                Travel travel = new Travel(1,"MEX-USA2", "Esatados Unidos", 500);

                travel.setId(statementSQL2.getInt("id"));
                travel.setName(statementSQL2.getString("name"));
                travel.setDestination(statementSQL2.getString("destination"));
                travel.setDeparture(statementSQL2.getDate("departure"));
                travel.setDeadline(statementSQL2.getDate("deadline"));
                travel.setPrice(statementSQL2.getInt("price"));
                travel.setPayments(statementSQL2.getInt("payments"));
                lista.add(travel);
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




