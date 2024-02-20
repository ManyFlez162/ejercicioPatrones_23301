/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 * F�brica para crear objetos de transporte
 * @author Manuel Francisco Flores Velazquez
 */
public class TransporteFactory {
    
    /**
     * Crea un objeto de transporte seg�n el tipo de paquete, distancia y tipo de servicio especificados.
     * @param tipoPaquete Tipo de paquete a transportar.
     * @param distancia Distancia entre la direcci�n de recolecci�n y entrega en kil�metros.
     * @param tipoServicio Tipo de servicio de entrega (Est�ndar o Express).
     * @return Objeto de transporte creado.
     * @throws IllegalArgumentException Si no se puede determinar el transporte adecuado.
     */
    public static Transporte crearTransporte(String tipoPaquete, double distancia, String tipoServicio) {
        if (tipoPaquete.equals("sobre") || tipoPaquete.equals("caja peque�a")) {
            if (distancia <= 1 && tipoServicio.equals("express")) {
                return new Dron();
            } else if (distancia > 1 && tipoServicio.equals("estandar")) {
                return new Bicicleta();
            } else if (distancia > 1 && tipoServicio.equals("express")) {
                return new Moto();
            }
        } else if (tipoPaquete.equals("mediano")) {
            if (distancia <= 5 && tipoServicio.equals("estandar")) {
                return new Bicicleta();
            } else if (distancia > 5 || tipoServicio.equals("express")) {
                return new Moto();
            }
        } else if (tipoPaquete.equals("grande")) {
            return new Auto();
        }

        throw new IllegalArgumentException("No se pudo determinar el transporte");
    }
    
}
