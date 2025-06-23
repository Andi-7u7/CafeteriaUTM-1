package com.mycompany.cafeteria;
import java.time.LocalDateTime;

/**
 *
 * @author jenif
 */
public class Ventas {
    private int idVenta;
    private String fecha;
    private String hora;
    private Pedidos pedios;
    private Encargado encargado;
    private LocalDateTime fechahoraventas;
    private float descuento;
    private float totalPagar;
    private float subtotal;
    private boolean beca;

    public Ventas(){
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.pedios = pedios;
        this.encargado = encargado;
        this.descuento = descuento;
        this.totalPagar = totalPagar;
        this.beca = beca;
        this.fechahoraventas = fechahoraventas;
    }
    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Pedidos getPedios() {
        return pedios;
    }

    public void setPedios(Pedidos pedios) {
        this.pedios = pedios;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public LocalDateTime getFechahoraventas() {
        return fechahoraventas;
    }

    public void setFechahoraventas(LocalDateTime fechahoraventas) {
        this.fechahoraventas = fechahoraventas;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }
    
    
    
    public void datosV(){
        System.out.println("id: "+ this.idVenta + " - Fecha y Hora: " + this.fechahoraventas  + "-Encargado: " + this.encargado.getNombreE() + "-Venta total: " + this.totalPagar +"-Descuento: "+this.getDescuento() + "-Total venta con descuento: " + this.subtotal);
    }
    
}
