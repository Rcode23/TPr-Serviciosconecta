/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciosconecta;

public class Garantia {
    private String tipo;        
    private String codigo;      
    private int diasGarantia;

    
    public Garantia(String tipo, String codigo, int diasGarantia) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.diasGarantia = diasGarantia;
        validarGarantia();
    }

    
    public Garantia(String tipo, int diasGarantia) {
        this.tipo = tipo;
        this.diasGarantia = diasGarantia;
        this.codigo = "N/A"; 
        validarGarantia();
    }

    private void validarGarantia() {
        if (tipo.equalsIgnoreCase("Producto") && diasGarantia > 365) {
            System.out.println("Verificacion correcta");
        } else if (tipo.equalsIgnoreCase("Servicio") && diasGarantia > 30) {
            System.out.println("Verificacion correcta");
        } else {
            System.out.println("Garantia valida para " + tipo);
        }
    }

    public String getTipo() {
        return tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDiasGarantia() {
        return diasGarantia;
    }
}
