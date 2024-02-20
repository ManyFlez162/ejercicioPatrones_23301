/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

/**
 * Clase de prueba para la aplicación de mensajería
 * @author Manuel Francisco Flores Velazquez
 */
public class Mensajeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tipoPaquete = "mediano";
        double distancia = 12;
        String tipoServicio = "express";
        
        Transporte transporte = TransporteFactory.crearTransporte(tipoPaquete, distancia, tipoServicio);
        double costo = transporte.calcularCosto(distancia);
        double tiempo = transporte.calcularTiempo(distancia);
        
        System.out.println("El costo del servicio es $"+ costo);
        System.out.println("Se entregará en "+ transporte.getClass().getSimpleName());
        System.out.println("En un tiempo aproximado de "+ tiempo +" horas");
        
    }
    
}

