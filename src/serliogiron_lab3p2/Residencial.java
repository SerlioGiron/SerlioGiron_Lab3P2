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
public class Residencial {
    ArrayList <Casa> casas = new ArrayList();
    ArrayList <Edificio> edificios = new ArrayList();
    String Nombre;
    
    //constructores

    public Residencial() {
    }

    public Residencial(String Nombre) {
        this.Nombre = Nombre;
    }
    
    //to String

    @Override
    public String toString() {
        return "Residencial{" + "casas=" + casas + ", edificios=" + edificios + ", Nombre=" + Nombre + '}';
    }
    
    //getters and setters

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }

    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {
        this.edificios = edificios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
