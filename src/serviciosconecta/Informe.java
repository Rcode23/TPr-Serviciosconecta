/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciosconecta;

public class Informe {
    private String nombreCliente;
    private String descripcionEquipo;
    private boolean adquirioProducto;

    public Informe(String nombreCliente, String descripcionEquipo, boolean adquirioProducto) {
        this.nombreCliente = nombreCliente;
        this.descripcionEquipo = descripcionEquipo;
        this.adquirioProducto = adquirioProducto;
    }

    public void generarInforme() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Equipo: " + descripcionEquipo);
        if (adquirioProducto) {
            System.out.println("Producto adquirido con exito.");
        } else {
            System.out.println("El cliente no adquirio un producto.");
        }
    }
}
