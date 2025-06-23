package com.mycompany.cafeteria;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

/**
 *
 * @author jenif
 */
public class CafeteriaUTM {

    Scanner teclado = new Scanner(System.in);

    ArrayList<Encargado> arregloEncargado = new ArrayList<>();
    ArrayList<Cliente> arregloCliente = new ArrayList<>();
    ArrayList<Comida> arreglomenuComida = new ArrayList<>();
    ArrayList<Bebida> arreglomenuBebida = new ArrayList<>();
    ArrayList<Integer> arregloCPC = new ArrayList<>();
    ArrayList<Pedidos> arregloPedido = new ArrayList<>();
    ArrayList<Integer> arregloCPB = new ArrayList<>();
    ArrayList<Ventas> arregloVenta = new ArrayList<>();

    static int numPedido = 0;

   
    private void ConstruirObjetosEmpleados() {
        Encargado empleado1 = new Encargado(1, "Paco", "Matutino");
        Encargado empleado2 = new Encargado(2, "Elliot", "Vespertino");
        arregloEncargado.add(empleado1);
        arregloEncargado.add(empleado2);
    }

    private void MostrarObjetoEmpleados() {
        for (int i = 0; i < arregloEncargado.size(); i++) {
            arregloEncargado.get(i).mostrardatosE();
            arregloEmpleados.get(i).getTurno();
        }
    }
    //Construyendo Objeto Cliente

    private void ConstruirObjetosClientes() {
        Cliente cliente1 = new Cliente(1, "Paco", true, "50%");
        Cliente cliente2 = new Cliente(2, "Paco2", false, "0%");

        arregloCliente.add(cliente1);
        arregloCliente.add(cliente2);
    }

    private void MostrarObjetosClientes() {
        for (int i = 0; i < arregloCliente.size(); i++) {
            arregloCliente.get(i).mostrardatos();
        }
    }

    private void RegistrarProductosComida() {
        System.out.println("Se registran productos de comida en el inventario");

        Comida comida1 = new Comida("C1", "Tacos de barbacoa", 55.0f, (short) 6, "Tortilla, carne, salsa", "3 piezas");
        Comida comida2 = new Comida("C2", "Tortas", 50.0f, (short) 5, "Pan, Milanesa, Lechuga, Jitomate, Cebolla", "1 piezas");
        Comida comida3 = new Comida("C3", "Chilaquiles", 60.0f, (short) 7, "Tortilla, salsa, Pollo, Huevo", "1 orden");

        arreglomenuComida.add(comida1);
        arreglomenuComida.add(comida2);
        arreglomenuComida.add(comida3);
    }

    private void ConsultarProductosComida() {
        for (int i = 0; 1 < arreglomenuComida.size(); i++) {
            System.out.println("Id: " + i + ":");
            arreglomenuComida.get(i).mostrarDC();
        }
    }

    private void RegistrarProductosBebida() {
        System.out.println("Se registran productos de Bebidas en el inventario");

        Bebida bebida1 = new Bebida("B1", "Agua de piña", 25.0f, (short) 10, "Piña", "Botella", 600);
        Bebida bebida2 = new Bebida("B2", "Agua de jamaica", 15.0f, (short) 5, "Jamaica", "Vaso", 350);
        Bebida bebida3 = new Bebida("B3", "Cafe", 10.0f, (short) 8, "Cafe", "vaso", 500);

        arreglomenuBebida.add(bebida1);
        arreglomenuBebida.add(bebida2);
        arreglomenuBebida.add(bebida3);
    }

    private void ConsultarProductosBebida() {
        for (int i = 0; 1 < arreglomenuBebida.size(); i++) {
            System.out.println("Id: " + i + ":");
            arreglomenuBebida.get(i).mostrarDB();
        }
    }
     public static void main(String[] args) {
        CafeteriaUTM cafeteria = new CafeteriaUTM();
        cafeteria.mostrarMenuPrincipal();

    }

    public void mostrarMenuPrincipal() {
        byte opc = 0;
        ConstruirObjetosEmpleados();
        ConstruirObjetosClientes();
        RegistrarProductosComida();
        RegistrarProductosBebida();

        do {
            System.out.println("  ");
            System.out.println("__________________");
            System.out.println("BIENVENIDO A LA CAFETERIA UTM");
            System.out.println("__________________");
            System.out.println("Selecciona el menu de las operaciones a realizar");
            System.out.println("1. Gestionar Productos, Empleados y Clientes");
            System.out.println("2. Levantar pedidos y ventas");
            System.out.println("3. Reportes de ventas");
            System.out.println("4. Salir");
            System.out.println("Dame la opcion");
            opc = teclado.nextByte();

            switch (opc) {
                case 1:
                    System.out.println("____LISTADO DE EMPLEADOS____");
                    this.ConstruirObjetosEmpleados();
                    this.MostrarObjetoEmpleados();
                    System.out.println("  ");
                    System.out.println("____LISTADO DE CLIENTES____");
                    this.ConstruirObjetosClientes();
                    this.MostrarObjetosClientes();
                    System.out.println("  ");
                    System.out.println("____LISTADO DE COMIDAS____");
                    this.RegistrarProductosComida();
                    this.ConsultarProductosComida();
                    System.out.println("  ");
                    System.out.println("____LISTADO DE BEBIDAS____");
                    this.RegistrarProductosBebida();
                    this.ConsultarProductosBebida();
                    System.out.println("  ");
                    break;

                case 2:
            }
        } while (opc != 4);
    }

    private void RegistrarPedidosClientes() {
        Pedidos pedido = new Pedidos();
        Cliente cliente = null;
        Comida comida;
        Bebida bebida;
        byte elemento;
        int cantidad;
        short idCliente = 0;
        byte totalComidas = 0;
        double totalPrecioComida = 0;
        int totalCantidadComidas = 0;
        byte totalComida = 0;
        byte totalBebidas = 0;
        int totalCantidadBebidas = 0;
        double totalPrecioBebida = 0;
        double subtotal = 0;
        double descuento = 0;
        int totalItems = 0;
        double totalPagar = 0;
        byte numPedidoActual;
        String respuesta = "si";
        short existenciasPedido = 0;
        boolean insertar = false;

        // Fecha y hora actual
        LocalDateTime now = LocalDateTime.now();
        String fecha = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String hora = now.format(DateTimeFormatter.ofPattern("HH:mm"));

        //Seleccion de cliente
        System.out.println("___Clientes Registrados___");

        MostrarObjetosClientes();
        System.out.print("Indica que cliente hara pedido");
        idCliente = teclado.nextShort();
        cliente = buscarClientePorid(idCliente);

        if (cliente == null) {
            System.out.println("Cliente no encontrado");
            return;

        }
        System.out.println("Cliente seleccionado:" + cliente.getNombreC());

        pedido = new Pedidos();
        pedido.setNumPedido(0);
        pedido.setFecha(fecha);
        pedido.setHora(hora);
        pedido.setIdCliente(cliente);
        arregloPedido.add(pedido);
        numPedidoActual = (byte) (arregloPedido.size() - 1);

        System.out.println("Menu de Comida");
        ConsultarProductosComida();
        System.out.print("Cuantas ordenes de comida vas a pedir? ");

        totalComida = teclado.nextByte();
        totalCantidadComidas = 0;
        totalPrecioComida = 0;

        do {
            System.out.print("Numero del platillo:");
            elemento = teclado.nextByte();
            comida = arreglomenuComida.get(elemento);
            do {
                if (comida.getExistencias() == 0) {
                    System.out.println("Ya no tenemos existencias de ese platillo, elige otro ");
                    break;
                } else {
                    System.out.print("Cantidad de" + comida.getNombreP() + "Quieres comprar?");
                    cantidad = teclado.nextByte();
                    existenciasPedido = (short) (arreglomenuComida.get(elemento).getExistencias());

                    if (existenciasPedido < cantidad) {
                        System.out.println("No tenemos suficientes existencias del producto, solo tenemos en existencias " + existenciasPedido);
                    } else {
                        insertar = true;
                        break;
                    }
                }
            } while (cantidad > existenciasPedido);
            //arreglos de comida y cantidad
            pedido.productoPedidosComida.add(comida);
            pedido.productoCantidadPedidosComida.add(cantidad);

            totalCantidadComidas = totalCantidadComidas + cantidad;
            totalPrecioComida = totalPrecioComida + comida.getPrecio() * cantidad;
            System.out.println("Precio" + comida.getPrecio() + "X" + cantidad + "=$" + comida.getPrecio() * cantidad);

            System.out.println("___Corte de Comida___");
            System.out.println("Cantidda de comidas: " + totalCantidadComidas);
            System.out.println("Subtotal comida: $" + totalPrecioComida);

            // Registrar Bebidas
            System.out.println("--- MENÚ BEBIDAS ---");
            ConsultarProductosBebida();
            System.out.print("¿Cuántas bebidas deseas? ");
            totalBebidas = teclado.nextByte();
            totalCantidadBebidas = 0;
            totalPrecioBebida = 0;

            do {
                System.out.print("Numero de la Bebida:");
                elemento = teclado.nextByte();
                bebida = arreglomenuBebida.get(elemento);
                do {
                    if (comida.getExistencias() == 0) {
                        System.out.println("Ya no tenemos existencias de esa bebida, elige otra ");
                        break;
                    } else {
                        System.out.print("Cantidad de" + bebida.getNombreP() + "Quieres comprar?");
                        cantidad = teclado.nextByte();
                        existenciasPedido = (short) (arreglomenuBebida.get(elemento).getExistencias());

                        if (existenciasPedido < cantidad) {
                            System.out.println("No tenemos suficientes existencias de esa bebida, solo tenemos en existencias " + existenciasPedido);
                        } else {
                            insertar = true;
                            break;
                        }
                    }
                }while (cantidad > existenciasPedido);
            } 
            
            //arreglos de bebida y cantidad
            pedido.productoPedidoBebida.add(bebida);
            pedido.productoCantidadPedidoBebida.add(cantidad);

            totalCantidadBebidas = totalCantidadBebidas + cantidad;
            totalPrecioBebida = totalPrecioBebida + bebida.getPrecio() * cantidad;

            System.out.println("__________Corte de Bebidas__________");
            System.out.println("Cantidad de Bebidas: " + totalCantidadBebidas);
            System.out.println("Subtotal Bebidas: $ " + totalPrecioBebida);

            //=== RESUMEN DEL PEDIDO===
            totalItems = totalCantidadComidas + totalCantidadBebidas;
            subtotal = totalPrecioComida + totalPrecioBebida;
            descuento = subtotal * cliente.getPorcentaje() / 100;
            totalPagar = subtotal - descuento;

            System.out.println("Resumen del pedido: ");
            System.out.println("Total productos: " + totalItems);
            System.out.println("subtotal:$ " + subtotal);
            System.out.println("Descuento: (" + cliente.getPorcentaje() + "%):" + descuento);
            System.out.println("Total a pagar: $ " + totalPagar);

            //Actualizar y mostrar pedidos
            pedido.getSubTotal((short) totalItems);
            pedido.getSubTotal((float) totalPagar);
            pedido.mostrarPedidoFinal();

            //Confirmacion de pago
            teclado.nextLine();
            System.out.print("Deseas pagar el pedido? (si/no): ");
            respuesta = teclado.nextLine().trim().toLowerCase();
            if (respuesta.equals("si")) {
                registrarVentaProducto(numPedidoActual);
            }
            numPedido++;
            //metodo axuliar para encontrar cliente por ID

    private Cliente buscarClientePorid(short id) {
        for (Cliente indice : arregloCliente) {
            if (indice.getIdCliente() == id) {
                return indice;
            }
        }
        return null;
    }

    public void registrarVentaProducto(int numeroPedidoActual) {
        Ventas objVentas = null;
        int idEmpleadox = 0;
        Encargado objetoEncargado = null;
        String fecha;
        String hora;
        int idCliente;
        int numPedido;
        int productos;
        String porcentaje;
        float descuento;
        float subTotal;
        float totalPagar;
        float totalVenta;
        int totalCantidadComidas;
        int totalCantidadBebidas;
        float totalPrecioComida;
        float totalPrecioBebida;

        //recuperando los datos del objeto del pedido
    Pedido pedido = arregloPedido.get(numeroPedidoActual);
    fecha = pedido.fecha;
    hora = pedido.hora;
    idCliente = pedido.idCliente.getId();
    numPedido = pedido.numPedido;
    productos = pedido.getTotalProducto();
    subTotal = pedido.getsubTotal();
    descuento = pedido.idCliente.getDescuento();
    totalVenta = subTotal - descuento;
        
        //mostrando los datos de los empleados
  MostrarObjetoEmpleados();
    System.out.print("Indica qué Empleado hará el cobro: ");
    idEmpleadox = teclado.nextShort();

    for (int i = 0; i < arregloEncargado.size(); i++) {
        if (arregloEncargado.get(i).getidEncargado() == idEmpleadox) {
            objetoEncargado = arregloEncargado.get(i);
            break;
        }
    }

        //se crea el objeto de ventas
        objVentas = new Ventas();

        //se registran los datos en el ogjeto de ventas
         objVentas.registrarVentas(objVentas, fecha, hora, idCliente, objetoEncargado, numPedido, productos, subTotal, totalVenta);

        //se agrega el arreglo de venta
        arregloVenta.add(objVentas);
    int indiceActual = arregloVenta.size() - 1;

        System.out.println("Venta registrada");
    arregloVenta.get(indiceActual).mostrarVenta();
}

    public void mostrarVentasRealizadas() {
        Ventas objVentas = null;
        System.out.print("Pedidos vendidos");
        for (int i = 0; i < arregloVenta.size(); i++);
        {
            System.out.println("Pedidos vendidos " + arregloVenta.get(i).getVentas());
            objVentas = arregloVenta.get(i).getIdVentas();
            objVentas.mostrarVenta();
        }
    }

// Calcular totales
    double subtotal = totalPrecioComida + totalPrecioBebida;
    double descuento = 0;

    if (cliente.getDescuento () ) {
            String porcentaje = cliente.getPorcentaje().replace("%", "");
        descuento = (Double.parseDouble(porcentaje) / 100.0) * subtotal;
    }

    double totalPagar = subtotal - descuento;

    // Agregar el pedido a la lista
    pedido.totalProducto  = totalCantidadComidas + totalCantidadBebidas;
    pedido.subTotal  = (float) totalPagar;

    arregloPedidos.add (pedido);

    System.out.println ("----- PEDIDO REGISTRADO -----");
    pedido.mostrarPF ();

}
