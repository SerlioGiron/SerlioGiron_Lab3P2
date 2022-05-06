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
public class Cliente {
    String nombre;
    int edad;
    String id;
    String usario;
    String contra;
    ArrayList <BienesInmuebles> bienes = new ArrayList();
    
    //constructores

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String id, String usario, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.usario = usario;
        this.contra = contra;
    }
    
    //toString

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", usario=" + usario + ", contra=" + contra + ", bienes=" + bienes + '}';
    }
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<BienesInmuebles> getBienes() {
        return bienes;
    }

    public void setBienes(ArrayList<BienesInmuebles> bienes) {
        this.bienes = bienes;
    }
    
    
}
