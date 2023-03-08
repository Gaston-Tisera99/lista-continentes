/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Marina
 */
public class PaisDAO {
    Connection conector = null;
    PreparedStatement comando = null;
    String SQL = "";

    public PaisDAO() {
        conector = Conexion.getConexion();
    }
    
    public ArrayList<PaisVO> getPaises(String continent_code){
         ArrayList<PaisVO> al = new ArrayList<PaisVO>();
        try {
            SQL = "SELECT * FROM countries WHERE continent_code =? ORDER BY country_name";
            comando = conector.prepareStatement(SQL);
            comando.setString(1, continent_code);
            
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()) {
                al.add(new PaisVO(resultado.getString("country_code"), resultado.getString("country_name"), resultado.getString("capital"),resultado.getString("continent_code")));
            }
            
        }catch(Exception e) {
            
        }
        return al;
    }
        
        
    
}
