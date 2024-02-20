/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paquete;

/**
 * Interfaz para los tipos de transporte
 * @author Manuel Francisco Flores Velazquez
 */
public interface Transporte {
    
    /**
     * Calcula el costo del servicio de transporte.
     * @param distancia Distancia entre la dirección de recolección y entrega en kilómetros.
     * @return El costo del servicio de transporte.
     */
    double calcularCosto(double distancia);

    /**
     * Calcula el tiempo estimado de entrega del servicio de transporte.
     * @param distancia Distancia entre la dirección de recolección y entrega en kilómetros.
     * @return El tiempo estimado de entrega del servicio de transporte en horas.
     */
    double calcularTiempo(double distancia);
    
}
