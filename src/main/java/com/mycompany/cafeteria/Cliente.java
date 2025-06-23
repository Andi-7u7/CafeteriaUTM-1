package com.mycompany.cafeteria;

/**
 *
 * @author jenif
 */

public class Cliente {
    String nombreCliente;
    int idCliente;
    String porcentaje;
    boolean descuento;

    public Cliente(int idCliente, String nombreC, boolean descuento, String porcentaje) {
        this.nombreCliente = nombreC;
        this.idCliente = idCliente;
        this.porcentaje = porcentaje;
        this.descuento = descuento;
    }

    public String getNombreC() {
        return nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public boolean getDescuento() {
        return descuento;
    }

    public void setNombreC(String nombreC) {
        this.nombreCliente = nombreC;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
    
    public void mostrardatos(){
        System.out.println("id: "+ this.getIdCliente()+"-Nombre:" +this.getNombreC() +"-Descuento:" + this.getDescuento() +"-Porcentaje:" +this.getPorcentaje());
    }
    
}
