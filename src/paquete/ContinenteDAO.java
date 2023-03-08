/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Marina
 */
public class ContinenteDAO {
    
    Connection conector = null;
    PreparedStatement comando = null;
    String SQL = "";
    
    public ContinenteDAO() {
        
        conector = Conexion.getConexion();
    }
    
    public void ver(JComboBox cbContinente){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cbContinente.setModel(modeloCombo);
        
        try{
            SQL= "SELECT * FROM continents ORDER BY continent_name";
            comando = conector.prepareStatement(SQL);
            
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()){
                ContinenteVO r = new ContinenteVO(resultado.getString("continent_code"), resultado.getString("continent_name"));
                modeloCombo.addElement(r);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<ContinenteVO> ver2(){
            ArrayList<ContinenteVO> al = new ArrayList<ContinenteVO>();
        try {
            SQL = "SELECT * FROM continents ORDER BY continent_name";
            comando = conector.prepareStatement(SQL);
            
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()) {
                al.add(new ContinenteVO(resultado.getString("continent_code"), resultado.getString("continent_name")));
            }
            
        }catch(Exception e) {
            
        }
        return al;
    }
       
}
