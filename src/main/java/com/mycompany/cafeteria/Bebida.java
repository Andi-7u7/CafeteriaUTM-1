package com.mycompany.cafeteria;

/**
 *
 * @author jenif
 */

public class Bebida extends Producto{
private String sabor;
private float ml;
private String presentacion;
    
        public Bebida(String cveProducto, String nombreP, float precio, short existencias, String sabor, String presentacion, float ml){
            super (cveProducto, nombreP,(float) precio, existencias);
            this.sabor = sabor;
            this.ml = ml;
            this.presentacion = presentacion;
}

public String getSabor(){
return sabor;
}
public void setSabor(String sabor){
this.sabor = sabor;
}
public float getMl(){
return ml;
}
public void setMl(float ml){
this.ml = ml;
}
public String getPresentacion(){
return presentacion;
}
public void setPresentacion(String presentacion){
this.presentacion = presentacion;
}

public void mostrarDB(){
System.out.println("Nombre: " + this.getNombreP() + " - Precio: " + this.getPrecio () + " - Sabor: " + this.getSabor() + " - Existencias: " + this.getExistencias());
}

public void mostrarRDB(){
System.out.println("Nombre: " + this.getNombreP() + " - Precio: " + this.getPrecio () + " - Sabor: " + this.getSabor());
}
}