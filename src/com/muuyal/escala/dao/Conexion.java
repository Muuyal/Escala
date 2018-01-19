package com.muuyal.escala.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    protected Connection conexion;
    //JDBC driver nombre y base de datos URL
    private final String JDBC_DRIVER = "org.postgresql.Driver";
    private final String DB_URL = "jdbc:postgresql://localhost:5432/Escala";

    //Base de datos
    private final String USER = "postgres";
    private final String PASS = "Carlos#123";

    public void conectar() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void cerrar() throws SQLException{
        if(conexion != null){
            if(conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
