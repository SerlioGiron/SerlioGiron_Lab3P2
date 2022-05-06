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
public class Casa extends BienesInmuebles{
    int numero_decasa;
    //Residencial residencial;//<---------
    
    //constructores 

    public Casa() {
        super();
    }

    public Casa(int numero_decasa, String direccion, String dimension_terreno, String id, Residencial residencial) {
        super(direccion, dimension_terreno, id, residencial);
        this.numero_decasa = numero_decasa;
    }
    
    // to String

    @Override
    public String toString() {
        return "Casa{" + "numero_decasa=" + numero_decasa + ", residencial=" + residencial + '}';
    }
    
    // getters and setters

    public int getNumero_decasa() {
        return numero_decasa;
    }

    public void setNumero_decasa(int numero_decasa) {
        this.numero_decasa = numero_decasa;
    }
    
}
