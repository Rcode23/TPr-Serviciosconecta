/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciosconecta;

public class Cliente {
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private String equipo;

    public Cliente(String nombre, String dni, String direccion, String telefono, String equipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.equipo = equipo;
    }

    // Métodos getters (puedes añadir setters si los necesitas)
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String getEquipo() {
    return equipo;
    }

    public void mostrarDatos() {
        System.out.println("Cliente: " + nombre + ", DNI: " + dni+ "Direccion: " + direccion + ", Telefono: " 
                + telefono +"Cliente: " + nombre + ", Equipi: " + equipo);
        
    }
}