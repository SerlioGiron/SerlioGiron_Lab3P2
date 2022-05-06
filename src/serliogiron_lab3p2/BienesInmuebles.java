/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_lab3p2;

/**
 *
 * @author usuario
 */
public class BienesInmuebles {
    String direccion;
    String dimension_terreno;
    String id;
    Residencial residencial;
    
    //constructores

    public BienesInmuebles() {
    }

    public BienesInmuebles(String direccion, String dimension_terreno, String id, Residencial residencial) {
        this.direccion = direccion;
        this.dimension_terreno = dimension_terreno;
        this.id = id;
        this.residencial = residencial;
    }
    
    // getters and setters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDimension_terreno() {
        return dimension_terreno;
    }

    public void setDimension_terreno(String dimension_terreno) {
        this.dimension_terreno = dimension_terreno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Residencial getResidencial() {
        return residencial;
    }

    public void setResidencial(Residencial residencial) {
        this.residencial = residencial;
    }
    
    
}
