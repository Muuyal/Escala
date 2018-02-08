package com.muuyal.escala.dao;

import com.muuyal.escala.interfaces.PaymentDAO;
import com.muuyal.escala.payment.Payment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAOImpl extends Conexion implements PaymentDAO{

    @Override
    public void save(Payment payment) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("INSERT INTO \"Escala\".payment(\n" +
                    "\tid, \"user\", travel, \"paymentAmount\", total, \"amountLeft\", date)\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?);");
            statementSQL.setInt(1, payment.getId());
            statementSQL.setString(2, payment.getUser());
            statementSQL.setString(3, payment.getTravel());
            statementSQL.setInt(4, payment.getPaymentAmount());
            statementSQL.setInt(5, payment.getTotal());
            statementSQL.setInt(6, payment.getAmountLeft());
            statementSQL.setString(7, payment.getDate());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void update(Payment payment) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("UPDATE \"Escala\".payment\n" +
                    "\tSET id=?, \"user\"=?, travel=?, \"paymentAmount\"=?, total=?, \"amountLeft\"=?, date=?\n" +
                    "\tWHERE id=?;");
            statementSQL.setInt(1, payment.getId());
            statementSQL.setString(2, payment.getUser());
            statementSQL.setString(3, payment.getTravel());
            statementSQL.setInt(4, payment.getPaymentAmount());
            statementSQL.setInt(5, payment.getTotal());
            statementSQL.setInt(6, payment.getAmountLeft());
            statementSQL.setString(7, payment.getDate());
            statementSQL.setInt(8, payment.getId());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void delete(Payment payment) throws Exception {
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("DELETE FROM \"Escala\".payment\n" +
                    "\tWHERE id=?;");
            statementSQL.setInt(1, payment.getId());
            statementSQL.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public List<Payment> findAll() throws Exception {
        List<Payment> lista = null;
        try{
            this.conectar();
            PreparedStatement statementSQL = this.conexion.prepareStatement("SELECT * FROM \"Escala\".payment");

            lista = new ArrayList();
            ResultSet statementSQL2 = statementSQL.executeQuery();
            while(statementSQL2.next()){
                Payment payment = new Payment("", "",0, "");

                payment.setId(statementSQL2.getInt("id"));
                payment.setUser(statementSQL2.getString("user"));
                payment.setTravel(statementSQL2.getString("travel"));
                payment.setPaymentAmount(statementSQL2.getInt("paymentAmount"));
                payment.setTotal(statementSQL2.getInt("total"));
                payment.setAmountLeft(statementSQL2.getInt("amountLeft"));
                payment.setDate(statementSQL2.getString("date"));

                lista.add(payment);
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

