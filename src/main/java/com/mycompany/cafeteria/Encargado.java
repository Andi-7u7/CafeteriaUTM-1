package com.mycompany.cafeteria;

/**
 *
 * @author jenif
 */

public class Encargado {
    private String nombreE;
    private int idEncargado;
    private String turno;

    public Encargado(int idEncargado, String nombreE, String turno) {
        this.idEncargado = idEncargado;
        this.nombreE = nombreE;
        this.turno = turno;
    }
    
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getidEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(int idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void mostrardatosE(){
        System.out.println("id: "+ this.getidEncargado() + " - Nombre: " + this.getNombreE() + " - Turno: " + this.getTurno());
    }
   
}
