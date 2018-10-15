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

        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Escribe precio:");
        //precio_introducido_por_usuario = scanner.nextFloat();

        electrodomesticos.add(new Television(160, "C", "metal", 6, 55, true));
        electrodomesticos.add(new Television(150, "A", "metal", 4, 50, true));
        electrodomesticos.add(new Lavadora(170, "D", "blanco", 74, 4));
        electrodomesticos.add(new Television(160, "C", "rojo", 3, 60, true));
        electrodomesticos.add(new Lavadora(175, "B", "verde", 76, 7));
        electrodomesticos.add(new Lavadora(175, "B", "blanco", 78, 5));
        electrodomesticos.add(new Television(160, "C", "metal", 6, 54, true));
        electrodomesticos.add(new Lavadora(175, "F", "metal", 76, 6));
        electrodomesticos.add(new Television(160, "C", "rojo", 6, 55, true));
        electrodomesticos.add(new Television(160, "A", "blanco", 5, 45, true));

        int total = 0;
        float precio_total = 0;

        for (int a = 0; a < electrodomesticos.size(); a ++) {
            consumo_energetico = electrodomesticos.get(a).getConsumo_energetico();
            peso = electrodomesticos.get(a).getPeso();
            //carga = electrodomesticos.get(a).();
            total += electrodomesticos.get(a).getPrecio_base();
            //precio_total += electrocontrolador.precioFinal(electrodomesticos.get(a).getConsumo_energetico())
            if (electrodomesticos.get(a) instanceof Television) {
                System.out.println("Hola Television: precio: " +  electrodomesticos.get(a).getPrecio_base());
            } else if (electrodomesticos.get(a) instanceof Lavadora) {
                System.out.println("Hola Lavadora: precio: " +  electrodomesticos.get(a).getPrecio_base());
            }
        }

        System.out.println("Total: " + total);
    }
}
