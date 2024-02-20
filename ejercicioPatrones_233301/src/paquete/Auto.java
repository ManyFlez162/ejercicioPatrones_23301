/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public class Auto implements Transporte {
    
    /**
     * Calcula el costo del servicio de transporte en auto.
     */
    @Override
    public double calcularCosto(double distancia) {
        double costoBase = 30;
        double costoPorKilometro = 5;

        if (distancia > 10) {
            costoBase += (distancia - 10) * costoPorKilometro;
        }

        return costoBase;
    }

    /**
     * Calcula el tiempo estimado de entrega del servicio de transporte en auto.
     */
    @Override
    public double calcularTiempo(double distancia) {
        double velocidadPromedio = 40; // en Km/h
        return distancia / velocidadPromedio;
    }
    
}

