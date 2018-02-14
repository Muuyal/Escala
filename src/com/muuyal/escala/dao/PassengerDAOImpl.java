package com.muuyal.escala.dao;

import com.muuyal.escala.interfaces.PassengersDAO;
import com.muuyal.escala.passenger.Passenger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PassengerDAOImpl  extends Conexion implements PassengersDAO {

    @Override
    public void save(Passenger passenger) throws Exception {
        try {
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("INSERT INTO \"Escala\".passenger(\n" +
                    "\tid, name, travel, phone, \"eMail\", \"addressStreet\", \"addressCity\", \"addressColony\", \"addressPC\", notes)\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            statementSQL.setInt(1, passenger.getId());
            statementSQL.setString(2, passenger.getName());
            statementSQL.setString(3, passenger.getTravel());
            statementSQL.setString(4, passenger.getPhone());
            statementSQL.setString(5, passenger.geteMail());
            statementSQL.setString(6, passenger.getAddressStreet());
            statementSQL.setString(7, passenger.getAddressCity());
            statementSQL.setString(8, passenger.getAddressColony());
            statementSQL.setInt(9, passenger.getAddressPC());
            statementSQL.setString(10, passenger.getNotes());
            statementSQL.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void update(Passenger passenger) throws Exception {
        try {
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("UPDATE \"Escala\".passenger\n" +
                    "\tSET id=?, name=?, travel=?, phone=?, \"eMail\"=?, \"addressStreet\"=?, \"addressCity\"=?, " +
                    "\"addressColony\"=?, \"addressPC\"=?, notes=? WHERE id=?;");
            statementSQL.setInt(1, passenger.getId());
            statementSQL.setString(2, passenger.getName());
            statementSQL.setString(3, passenger.getTravel());
            statementSQL.setString(4, passenger.getPhone());
            statementSQL.setString(5, passenger.geteMail());
            statementSQL.setString(6, passenger.getAddressStreet());
            statementSQL.setString(7, passenger.getAddressCity());
            statementSQL.setString(8, passenger.getAddressColony());
            statementSQL.setInt(9, passenger.getAddressPC());
            statementSQL.setString(10, passenger.getNotes());
            statementSQL.setInt(11, passenger.getId());
            statementSQL.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void delete(Passenger passenger) throws Exception {
        try {
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("DELETE FROM \"Escala\".passenger\n" +
                    "\tWHERE id=?");
            statementSQL.setInt(1, passenger.getId());
            statementSQL.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<Passenger> findAll() throws Exception {
        List<Passenger> lista = null;

        try {
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("SELECT * FROM \"Escala\".passenger");

            lista = new ArrayList();
            ResultSet statementSQL2 = statementSQL.executeQuery();
            while (statementSQL2.next()) {
                Passenger passenger = new Passenger("", "","" , "");

                passenger.setId(statementSQL2.getInt("id"));
                passenger.setName(statementSQL2.getString("name"));
                passenger.setTravel(statementSQL2.getString("travel"));
                passenger.setPhone(statementSQL2.getString("phone"));
                passenger.seteMail(statementSQL2.getString("eMail"));
                passenger.setAddressStreet(statementSQL2.getString("addressStreet"));
                passenger.setAddressCity(statementSQL2.getString("addressCity"));
                passenger.setAddressColony(statementSQL2.getString("addressColony"));
                passenger.setAddressPC(statementSQL2.getInt("addressPC"));
                passenger.setNotes(statementSQL2.getString("notes"));

                lista.add(passenger);
            }
            statementSQL2.close();
            statementSQL.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lista;
    }

    @Override
    public List<Passenger> findAll(String search) throws Exception {
        List<Passenger> lista = null;

        try {
            this.conectar();

            //if (search.matches("[a-zA-Z]+.?")){
                // TODO search for string fields
                PreparedStatement statementSQL = this.conexion.prepareStatement("SELECT * FROM \"Escala\".passenger " +
                        "WHERE id LIKE '%"+ search +"%' OR name LIKE '%"+ search +"%' OR travel LIKE '%"+ search +"%' OR " +
                        "phone LIKE '%"+ search +"%' OR \"eMail\" LIKE '%"+ search +"%' OR " +
                        "\"addressStreet\" LIKE '%"+ search +"%' OR \"addressCity\" LIKE '%"+ search +"%' OR " +
                        "\"addressColony\" LIKE '%"+ search +"%' OR \"addressPC\" LIKE '%"+ search +"%' OR " +
                        "notes LIKE '%"+ search +"%';");

                lista = new ArrayList();
                ResultSet statementSQL2 = statementSQL.executeQuery();
                while (statementSQL2.next()) {
                    Passenger passenger = new Passenger("", "","" , "");

                    passenger.setId(statementSQL2.getInt("id"));
                    passenger.setName(statementSQL2.getString("name"));
                    passenger.setTravel(statementSQL2.getString("travel"));
                    passenger.setPhone(statementSQL2.getString("phone"));
                    passenger.seteMail(statementSQL2.getString("eMail"));
                    passenger.setAddressStreet(statementSQL2.getString("addressStreet"));
                    passenger.setAddressCity(statementSQL2.getString("addressCity"));
                    passenger.setAddressColony(statementSQL2.getString("addressColony"));
                    passenger.setAddressPC(statementSQL2.getInt("addressPC"));
                    passenger.setNotes(statementSQL2.getString("notes"));

                    lista.add(passenger);
                }
                statementSQL2.close();
                statementSQL.close();

            /*} else {
                Integer temp = Integer.valueOf(search);
                // TODO search for integer fields
                PreparedStatement statementSQL = this.conexion.prepareStatement("");

                lista = new ArrayList();
                ResultSet statementSQL2 = statementSQL.executeQuery();
                while (statementSQL2.next()) {
                    Passenger passenger = new Passenger("", "","" , "");

                    passenger.setId(statementSQL2.getInt("id"));
                    passenger.setName(statementSQL2.getString("name"));
                    passenger.setTravel(statementSQL2.getString("travel"));
                    passenger.setPhone(statementSQL2.getString("phone"));
                    passenger.seteMail(statementSQL2.getString("eMail"));
                    passenger.setAddressStreet(statementSQL2.getString("addressStreet"));
                    passenger.setAddressCity(statementSQL2.getString("addressCity"));
                    passenger.setAddressColony(statementSQL2.getString("addressColony"));
                    passenger.setAddressPC(statementSQL2.getInt("addressPC"));
                    passenger.setNotes(statementSQL2.getString("notes"));

                    lista.add(passenger);
                }
                statementSQL2.close();
                statementSQL.close();

            }*/

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lista;
    }
}
