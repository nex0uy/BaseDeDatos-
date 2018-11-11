/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddatos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sombra
 */
public class bd_conn {
   
    private Connection conexion = null;
    
    public void Sqlconectar() throws SQLException{
        
            //String urlDatabase =  "jdbc:postgresql://192.168.56.101:5433/BD1"; 
            String urlDatabase = "jdbc:postgresql://localhost/postgres";
            try {
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(urlDatabase, "postgres", "G3j02606");
                //conexion = DriverManager.getConnection(urlDatabase, "postgres", "basededatos");
                System.out.println("La conexión se realizo sin problemas!");
            } catch (Exception e) {
                System.out.println("Ocurrio un error : "+e.getMessage());
            }
    }

    public Connection getConexion() {
        return conexion;
    }
    
    
    
}
