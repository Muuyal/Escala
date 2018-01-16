package com.muuyal.escala.dao;

import com.muuyal.escala.interfaces.TravelDAO;
import com.muuyal.escala.travel.Travel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TravelDAOImpl extends Conexion implements TravelDAO {

    @Override
    public void registrar(Travel trav) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO travel (id, name, destination, price) VALUES (?, ?, ?, ?)");
            st.setInt(1, trav.setId());
            st.setString(2, trav.setName());
            st.setString(3, trav.setDestination());
            st.setInt(4, trav.setPrice());
            st.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Travel trav) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE travel SET departure = ?, deadline = ?, payments = ? WHERE ID = ?");
            st.setDate(1, trav.setDeparture());
            st.setDate(2, trav.setDeadline());
            st.setInt(3, trav.setPayments());
            st.setInt(4, trav.setId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Travel trav) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM travel WHERE id = ?");
            st.setInt(1, trav.setId());
            st.executeUpdate();
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
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM travel");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Travel trav = new Travel();
                trav.setId(rs.getInt("id"));
                trav.setName(rs.getString("name"));
                lista.add(trav);
            }
            rs.close();
            st.close();

        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }
}




