package com.marc;

import com.marc.constantes.Constantes;
import com.marc.controladores.ElectrodomesticoControlador;
import com.marc.modelos.Electrodomestico;
import com.marc.modelos.Lavadora;
import com.marc.modelos.Television;

import java.util.ArrayList;

public class App {
    private static ElectrodomesticoControlador electrocontrolador = new ElectrodomesticoControlador();

    private static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

    private static String consumo_energetico;
    private static int peso;
    private static float precio_total_television = 0f;
    private static float precio_total_lavadora = 0f;
    private static float precio_total_televisiones = 0f;
    private static float precio_total_lavadoras = 0f;

    public static void main(String[] args) {
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

            if (electrodomesticos.get(a) instanceof Television) {
                precio_total_television = electrodomesticos.get(a).getPrecio_base() + electrocontrolador.precioFinal(consumo_energetico, peso);
                precio_total_televisiones += electrodomesticos.get(a).getPrecio_base() + electrocontrolador.precioFinal(consumo_energetico, peso);
                System.out.println("Television " + a + ": precio base: " +  electrodomesticos.get(a).getPrecio_base() + " -  precio final: " + precio_total_television);
            } else if (electrodomesticos.get(a) instanceof Lavadora) {
                precio_total_lavadora = electrodomesticos.get(a).getPrecio_base() + electrocontrolador.precioFinal(consumo_energetico, peso);
                precio_total_lavadoras += electrodomesticos.get(a).getPrecio_base() + electrocontrolador.precioFinal(consumo_energetico, peso);
                System.out.println("Lavadora   " + a + ": precio base: " +  electrodomesticos.get(a).getPrecio_base() + " -  precio final: " + precio_total_lavadora);
            }
        }

        System.out.println();
        System.out.println("PRECIO TOTAL Televisiones: " + precio_total_televisiones);
        System.out.println("PRECIO TOTAL lavadoras: " + precio_total_lavadoras);
    }
}
