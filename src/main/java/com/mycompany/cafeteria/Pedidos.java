package com.mycompany.cafeteria;

import java.util.ArrayList;

/**
 *
 * @author jenif
 */
public class Pedidos {

  private int numPedido;
    private String fecha;
    private String hora;
    Cliente idCliente;
    int totalProducto;
    float subTotal;

    ArrayList<Comida> productoPedidosComida = new ArrayList<>();
    ArrayList<Integer> productoCantidadPedidosComida = new ArrayList<>();
    ArrayList<Bebida> productoPedidoBebida = new ArrayList<>();
    ArrayList<Integer> productoCantidadPedidoBebida = new ArrayList<>();

    public Pedidos() {
        this.numPedido = 0;
        this.fecha = "";
        this.hora = "";
        this.idCliente = null;
        this.totalProducto = 0;
        this.subTotal = 0;
    }

    public Pedidos(int numPedido, String fecha, String hora, Cliente idCliente, int totalProducto, float subTotal) {
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.hora = hora;
        this.idCliente = idCliente;
        this.totalProducto = totalProducto;
        this.subTotal = subTotal;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
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

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public int getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(int totalProducto) {
        this.totalProducto = totalProducto;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }


    public void mostrarDatosPedido() {
        System.out.println("Cve: " + this.numPedido + " - Fecha: " + this.fecha + " - Hora: " + this.hora + " - Cliente: " + this.idCliente.getNombreC());
    }

    public void mostrarPedidoFinal() {
        System.out.println("---- PEDIDO FINAL ----");
        System.out.println("Pedido No: " + this.numPedido);
        System.out.println("Fecha: " + this.fecha + " - Hora: " + this.hora);
        System.out.println("Cliente: " + this.idCliente.getNombreC());
        System.out.println("Total productos: " + this.totalProducto);
        System.out.println("Total a pagar: $" + this.subTotal);
    }
}