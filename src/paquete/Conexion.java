/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.sql.*;

/**
 *
 * @author Marina
 */
public class Conexion {
    public static Connection getConexion(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid19", "root", "");
            if (conn != null) {
        System.out.println("Connected");
         }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    
}
