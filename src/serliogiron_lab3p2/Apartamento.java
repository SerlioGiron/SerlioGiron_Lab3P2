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
public class Apartamento extends BienesInmuebles{
    int numero_local;
    Edificio edificio;
    
    //contructores

    public Apartamento() {
        super();
    }

    public Apartamento(int numero_local, Edificio edificio, String direccion, String dimension_terreno, String id, Residencial residencial) {
        super(direccion, dimension_terreno, id, residencial);
        this.numero_local = numero_local;
        this.edificio = edificio;
    }
    
    //toString

    @Override
    public String toString() {
        return "Apartamento{" + "numero_local=" + numero_local + ", edificio=" + edificio + '}';
    }
    
    //getters and setter

    public int getNumero_local() {
        return numero_local;
    }

    public void setNumero_local(int numero_local) {
        this.numero_local = numero_local;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
    
}
