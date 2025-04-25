/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciosconecta;

import java.util.ArrayList;

public class Registro {
    // Colecciones para almacenar registros
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Informe> listaInformes = new ArrayList<>();
    private ArrayList<Garantia> listaGarantias = new ArrayList<>();

    // Método sobrecargado para registrar un cliente
    public void registrar(String nombre, String dni, String direccion, String telefono, String equipo) {
        if (nombre.isEmpty() || dni.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || equipo.isEmpty()) {
            throw new IllegalArgumentException("Registro incompleto");
        }

        Cliente nuevo = new Cliente(nombre, dni, direccion, telefono, equipo);
        listaClientes.add(nuevo);
        System.out.println("Cliente registrado correctamente.");
    }

    // Método sobrecargado para registrar un informe final
    public void registrar(String dniCliente, String descripcion, boolean adquirioProducto) {
        Informe inf = new Informe(dniCliente, descripcion, adquirioProducto);
        listaInformes.add(inf);
        System.out.println("Informe generado correctamente.");
    }

 // Sobrecarga para registrar garantía de producto
    public static Garantia registrar(String tipo, String codigoEquipo, int diasGarantia) {
        if (diasGarantia > 365) {
            System.out.println("Producto fuera de garantia");
        }
        return new Garantia(tipo, codigoEquipo, diasGarantia);
    }

    // Sobrecarga para registrar garantía de servicio
    public static Garantia registrar(String tipo, int diasGarantia) {
        if (diasGarantia > 30) {
            System.out.println("Servicio fuera de garantía");
        }
        return new Garantia(tipo, "SinCodigo", diasGarantia);
    }
    

    // Métodos para visualizar registros (opcional para pruebas)
    public void mostrarClientes() {
        for (Cliente c : listaClientes) {
            System.out.println(c);
        }
    }

    public void mostrarInformes() {
        for (Informe i : listaInformes) {
            System.out.println(i);
        }
    }

    public void mostrarGarantias() {
        for (Garantia g : listaGarantias) {
            System.out.println(g);
        }
    }
}
