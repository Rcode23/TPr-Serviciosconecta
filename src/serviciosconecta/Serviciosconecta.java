/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serviciosconecta;
import java.util.ArrayList;
/**
 *
 * @author RICK
 */
public class Serviciosconecta {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        System.out.println("===== REGISTRO CLIENTE ====");
        // Probando clase Cliente
        Cliente cliente1 = new Cliente("Carlos Perez", "12345678", "Av. Siempre Viva 742", "987654321", "Laptop HP modelo 2024");
        cliente1.mostrarDatos(); // Muestra nombre y DNI
        
        System.out.println("===== INFORME DEL EQUIPO ====");
        // Probando clase Informe
        Informe informe1 = new Informe(cliente1.getNombre(), "Laptop HP modelo 2024", false);
        informe1.generarInforme(); // Muestra que no adquirió producto
        
        System.out.println("===== VERIFICACION DE GARANTIA DE PRODUCTO ====");
        // Probando clase Garantía - producto fuera de garantía
        Garantia garantia1 = Registro.registrar("Producto", "EQ123", 400); // 400 días, debería estar fuera
        
        System.out.println("===== VERIFICACION DE GARANTIA DE SERVICIO ====");
        // Probando clase Garantía - servicio dentro del rango
        Garantia garantia2 = Registro.registrar("Servicio", 20); // dentro de los 30 días, debería estar cubierto

        System.out.println("\n===== CLIENTES REGISTRADOS ====");
        // Agregando Clientes a una colección (uso de ArrayList)
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente1);

        System.out.println("Cantidad total de clientes registrados: " + listaClientes.size());
        
        // Mostrar los datos de todos los clientes registrados
        for (Cliente c : listaClientes) {
            c.mostrarDatos();
        }
    }
}
