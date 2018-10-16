package com.marc;

import com.marc.controladores.ElectrodomesticoControlador;
import com.marc.modelos.Electrodomestico;
import com.marc.modelos.Lavadora;
import com.marc.modelos.Television;

import java.util.ArrayList;

public class App {
    private static String consumo_energetico;
    private static int peso;
    private static int total = 0;
    private static float precio_total = 0f;
    private static float precio_total_televisiones = 0f;
    private static float precio_total_lavadoras = 0f;

    public static void main(String[] args) {
        ElectrodomesticoControlador electrocontrolador = new ElectrodomesticoControlador();

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
        ArrayList<Television> televisiones = new ArrayList<Television>();
        ArrayList<Lavadora> lavadoras = new ArrayList<Lavadora>();

        electrodomesticos.add(new Television(160, "C", "metal", 6, 55, true));
        electrodomesticos.add(new Television(150, "A", "metal", 4, 50, true));
        electrodomesticos.add(new Lavadora(350, "D", "blanco", 74, 4));
        electrodomesticos.add(new Television(160, "C", "rojo", 3, 60, true));
        electrodomesticos.add(new Lavadora(400, "B", "verde", 76, 7));
        electrodomesticos.add(new Lavadora(500, "B", "blanco", 78, 5));
        electrodomesticos.add(new Television(160, "C", "metal", 6, 54, true));
        electrodomesticos.add(new Lavadora(750, "F", "metal", 76, 6));
        electrodomesticos.add(new Television(160, "C", "rojo", 6, 55, true));
        electrodomesticos.add(new Television(160, "A", "blanco", 5, 45, true));

        for (int a = 0; a < electrodomesticos.size(); a ++) {
            consumo_energetico = electrodomesticos.get(a).getConsumo_energetico();
            peso = electrodomesticos.get(a).getPeso();

            precio_total += electrocontrolador.precioFinal(consumo_energetico, peso);
            total += electrodomesticos.get(a).getPrecio_base();

            if (electrodomesticos.get(a) instanceof Television) {
                precio_total_televisiones += electrodomesticos.get(a).getPrecio_base();
                System.out.println("Hola Television: precio: " +  electrodomesticos.get(a).getPrecio_base() + " - " + precio_total);
            } else if (electrodomesticos.get(a) instanceof Lavadora) {
                System.out.println("Hola Lavadora: precio: " +  electrodomesticos.get(a).getPrecio_base() + " - " + precio_total);
                precio_total_lavadoras += electrodomesticos.get(a).getPrecio_base();
            }

        }

        System.out.println("PRECIO TOTAL Televisiones: " + precio_total_televisiones);
        System.out.println("PRECIO TOTAL lavadoras: " + precio_total_lavadoras);
    }
}
