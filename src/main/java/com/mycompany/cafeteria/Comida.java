package com.mycompany.cafeteria;

/**
 *
 * @author jenif
 */
public class Comida extends Producto{
    private String ingrediente;
    private String porcion;
    
    public Comida(String cveProducto, String nombreP, float precio, short existencias, String ingrediente, String porcion){
            super (cveProducto, nombreP,(float) precio, existencias);
             
            this.getCveProducto();
            this.getNombreP();
            this.getPrecio();
            this.getExistencias();
            this.ingrediente = ingrediente;
            this.porcion = porcion;
}

public String getIngrediente(){
return ingrediente;
}
public void setIngrediente(String ingrediente){
this.ingrediente = ingrediente;
}

public String getPorcion(){
return porcion;
}
public void setPorcion(String porcion){
this.porcion = porcion;
}
public void mostrarDC(){
System.out.println("Nombre: " + this.getNombreP() + " - Precio: " + this.getPrecio () + " - Ingredientes: " + this.getIngrediente() + " - Porcion: " + this.getPorcion () + " - Existencias: " + this.getExistencias());
}

public void mostrarRDC(){
System.out.println("Nombre: " + this.getNombreP() + " - Precio: " + this.getPrecio ());
}
}