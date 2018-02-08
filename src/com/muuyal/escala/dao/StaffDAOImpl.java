package com.muuyal.escala.dao;

import com.muuyal.escala.interfaces.StaffDAO;
import com.muuyal.escala.staff.Staff;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StaffDAOImpl extends Conexion implements StaffDAO{

    @Override
    public void save(Staff staff) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("INSERT INTO \"Escala\".staff(\n" +
                    "\tid, name, \"eMail\", phone, address, area, salary, \"user\", password)\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
            statementSQL.setInt(1, staff.getId());
            statementSQL.setString(2, staff.getName());
            statementSQL.setString(3, staff.geteMail());
            statementSQL.setString(4, staff.getPhone());
            statementSQL.setString(5, staff.getAddress());
            statementSQL.setString(6, staff.getArea());
            statementSQL.setInt(7, staff.getSalary());
            statementSQL.setString(8, staff.getUser());
            statementSQL.setString(9, staff.getPassword());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void update(Staff staff) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("UPDATE \"Escala\".staff\n" +
                    "\tSET id=?, name=?, \"eMail\"=?, phone=?, address=?, area=?, salary=?, \"user\"=?, password=?\n" +
                    "\tWHERE id=?;");
            statementSQL.setInt(1, staff.getId());
            statementSQL.setString(2, staff.getName());
            statementSQL.setString(3, staff.geteMail());
            statementSQL.setString(4, staff.getPhone());
            statementSQL.setString(5, staff.getAddress());
            statementSQL.setString(6, staff.getArea());
            statementSQL.setInt(7, staff.getSalary());
            statementSQL.setString(8, staff.getUser());
            statementSQL.setString(9, staff.getPassword());
            statementSQL.setInt(10, staff.getId());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void delete(Staff staff) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("DELETE FROM \"Escala\".staff\n" +
                    "\tWHERE id=?;");
            statementSQL.setInt(1, staff.getId());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public List<Staff> findAll() throws Exception {
        List<Staff> lista = null;
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("SELECT * FROM \"Escala\".staff");

            lista = new ArrayList();
            ResultSet statementSQL2 = statementSQL.executeQuery();
            while(statementSQL2.next()){
                Staff staff = new Staff("","",0);

                staff.setId(statementSQL2.getInt("id"));
                staff.setName(statementSQL2.getString("name"));
                staff.seteMail(statementSQL2.getString("eMail"));
                staff.setPhone(statementSQL2.getString("phone"));
                staff.setAddress(statementSQL2.getString("address"));
                staff.setArea(statementSQL2.getString("area"));
                staff.setSalary(statementSQL2.getInt("salary"));
                staff.setUser(statementSQL2.getString("user"));
                staff.setPassword(statementSQL2.getString("password"));

                lista.add(staff);
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
