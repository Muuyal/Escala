package com.muuyal.escala.dao;

import com.muuyal.escala.interfaces.TravelDAO;
import com.muuyal.escala.travel.Travel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TravelDAOImpl extends Conexion implements TravelDAO {

    @Override
    public void save(Travel travel) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("INSERT INTO \"Escala\".travel(\n" +
                    "\tid, name, destination, departure, deadline, price, payments)\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?);");
            statementSQL.setInt(1, travel.getId());
            statementSQL.setString(2, travel.getName());
            statementSQL.setString(3, travel.getDestination());
            statementSQL.setString(4, travel.getDeparture());
            statementSQL.setString(5, travel.getDeadline());
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
    public void update(Travel travel) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("UPDATE \"Escala\".travel\n" +
                    "\tSET id=?, name=?, destination=?, departure=?, deadline=?, price=?, payments=?\n" +
                    "\tWHERE id=?");
            statementSQL.setInt(1, travel.getId());
            statementSQL.setString(2, travel.getName());
            statementSQL.setString(3, travel.getDestination());
            statementSQL.setString(4, travel.getDeparture());
            statementSQL.setString(5, travel.getDeadline());
            statementSQL.setInt(6, travel.getPrice());
            statementSQL.setInt(7, travel.getPayments());
            statementSQL.setInt(8, travel.getId());
            statementSQL.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void delete(Travel travel) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("DELETE FROM \"Escala\".travel\n" +
                    "\tWHERE id=?");
            statementSQL.setInt(1, travel.getId());
            statementSQL.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Travel> findAll() throws Exception {
        List<Travel> lista = null;
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("SELECT * FROM \"Escala\".travel");

            lista = new ArrayList();
            ResultSet statementSQL2 = statementSQL.executeQuery();
            while(statementSQL2.next()){
                Travel travel = new Travel(0,"", "", 0);

                travel.setId(statementSQL2.getInt("id"));
                travel.setName(statementSQL2.getString("name"));
                travel.setDestination(statementSQL2.getString("destination"));
                travel.setDeparture(statementSQL2.getString("departure"));
                travel.setDeadline(statementSQL2.getString("deadline"));
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




