package com.mycompany.cafeteria;

/**
 *
 * @author jenif
 */
public class Producto {

    private String cveProducto;
    private String nombreP;
    private float precio;
    private short existencias;

    public Producto(String cveProductos, String nombreP, float precio, short existencias) {
        this.cveProducto = cveProductos;
        this.nombreP = nombreP;
        this.precio = precio;
        this.existencias = existencias;
    }

    public String getCveProducto() {
        return cveProducto;
    }

    public void setCveProducto(String cveProducto) {
    this.cveProducto = cveProducto;
}


    public String getNombreP() {
        return nombreP;
    }
    public void setNombreP(String nombreP) {
    this.nombreP = nombreP;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public short getExistencias() {
        return existencias;
    }
    public void setExistencias(short existencias) {
        this.existencias = existencias;
    }
public void mostrarDatos() {
        System.out.println("Clave: " + cveProducto + " | Nombre: " + nombreP + " | Precio: $" + precio + " | Existencias: " + existencias);
}
}
