/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Marina
 */
public class ContinenteVO {
   private String continent_code;
   private String continent_name;

    public ContinenteVO() {
    }

    public ContinenteVO(String continent_code, String continent_name) {
        this.continent_code = continent_code;
        this.continent_name = continent_name;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public void setContinent_code(String continent_code) {
        this.continent_code = continent_code;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public void setContinent_name(String continent_name) {
        this.continent_name = continent_name;
    }
   
   @Override
    public String toString() {
        return this.continent_name;
    }
}
