/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_lab3p2;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Edificio extends BienesInmuebles{
    int cantidad_locales;
    String nombre;
    ArrayList <Apartamento> apartamentos = new ArrayList();

    //constructores
    public Edificio() {
        super();
    }

    public Edificio(int cantidad_locales, String nombre, String direccion, String dimension_terreno, String id, Residencial residencial) {
        super(direccion, dimension_terreno, id, residencial);
        this.cantidad_locales = cantidad_locales;
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return "Edificio{" + "cantidad_locales=" + cantidad_locales + ", nombre=" + nombre + '}';
    }

    //getters and setters

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }
    
    
    
    public int getCantidad_locales() {
        return cantidad_locales;
    }

    public void setCantidad_locales(int cantidad_locales) {
        this.cantidad_locales = cantidad_locales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
