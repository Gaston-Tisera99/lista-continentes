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
public class PaisVO {
    private String country_code;
    private String country_name;
    private String capital;
    private String continent_code;

    public PaisVO() {
    }

    public PaisVO(String country_code, String country_name, String capital, String continent_code) {
        this.country_code = country_code;
        this.country_name = country_name;
        this.capital = capital;
        this.continent_code = continent_code;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public void setContinent_code(String continent_code) {
        this.continent_code = continent_code;
    }
    
    
}
