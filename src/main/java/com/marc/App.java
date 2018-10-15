package com.marc;

import com.marc.controladores.ElectrodomesticoControlador;
import com.marc.modelos.Electrodomestico;
import com.marc.modelos.Lavadora;
import com.marc.modelos.Television;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //private Electrodomestico electrodomestico[] = new Electrodomestico[10];

    //private static ElectrodomesticoControlador electrodomestico_control = new ElectrodomesticoControlador();
    private static Electrodomestico electrodomestico = new Electrodomestico();
    //private static Lavadora lavadora = new Lavadora();
    private static Television television = new Television();

    private static String letra_introducida_por_usuario;
    private static String color_introducido_por_usuario;
    private static int tamano_introducido_por_udsuario;
    private static int peso_introducido;
    private static int carga_introducida_por_usuario;
    private static int resolucion_introducida_por_usuario;
    private static int tiene_TDT;
    private static float precio_introducido_por_usuario;

    private static String consumo_energetico;
    private static int peso;
    private static int carga;

    public static void main(String[] args) {
        ElectrodomesticoControlador electrocontrolador = new ElectrodomesticoControlador();

        //Television tv = new Television();
        //Lavadora lavadora = new Lavadora();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
        ArrayList<Television> televisiones = new ArrayList<Television>();
        ArrayList<Lavadora> lavadoras = new ArrayList<Lavadora>();

        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Escribe precio:");
        //precio_introducido_por_usuario = scanner.nextFloat();

        televisiones.add(new Television(160, "C", "metal", 6, 55, true));
        televisiones.add(new Television(150, "A", "metal", 4, 50, true));
        lavadoras.add(new Lavadora(170, "D", "blanco", 74, 4));
        televisiones.add(new Television(160, "C", "rojo", 3, 60, true));
        lavadoras.add(new Lavadora(175, "B", "verde", 76, 7));
        lavadoras.add(new Lavadora(175, "B", "blanco", 78, 5));
        televisiones.add(new Television(160, "C", "metal", 6, 54, true));
        lavadoras.add(new Lavadora(175, "F", "metal", 76, 6));
        televisiones.add(new Television(160, "C", "rojo", 6, 55, true));
        televisiones.add(new Television(160, "A", "blanco", 5, 45, true));

        int total = 0;
        float precio_total = 0;

        for (int a = 0; a < lavadoras.size(); a ++) {
            consumo_energetico = lavadoras.get(a).getConsumo_energetico();
            peso = lavadoras.get(a).getPeso();

            precio_total += electrocontrolador.precioFinal(consumo_energetico, peso);
            total += lavadoras.get(a).getPrecio_base();

            System.out.println("Hola Lavadora: precio: " +  lavadoras.get(a).getPrecio_base() + " - " + precio_total);
        }

        for (int b = 0; b < televisiones.size(); b ++) {
            consumo_energetico = televisiones.get(b).getConsumo_energetico();
            peso = televisiones.get(b).getPeso();

            precio_total += electrocontrolador.precioFinal(consumo_energetico, peso);
            total += televisiones.get(b).getPrecio_base();

            System.out.println("Hola Television: precio: " +  televisiones.get(b).getPrecio_base() + " - " + precio_total);
        }

        System.out.println("Total: " + total);
        System.out.println("PRECIO TOTAL: " + precio_total);
    }
}
