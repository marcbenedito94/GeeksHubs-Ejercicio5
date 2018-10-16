package com.marc.modelos;

import com.marc.constantes.Constantes;

public class Electrodomestico {
    protected String Colores_Disponibles[] = {"blanco", "metal", "rojo", "verde", "azul"};
    protected String Consumos_Energeticos[] = {"A", "B", "C", "D", "E", "F"};

    protected String color = Constantes.color_por_defecto;
    protected String consumo_energetico = Constantes.consumo_energetico_por_defecto;

    private String letra_correcta_consumo_energetico;
    private String color_correcto;
    protected int peso = Constantes.peso_por_defecto;
    protected float precio_base = Constantes.precio_base_por_defecto;
    private float precio_final = Constantes.precio_final_inicial;
    private boolean es_letra_correcta;
    private boolean es_color_correcto;

    public Electrodomestico () {
    }

    public Electrodomestico (float precio_base, int peso) {
        this.precio_base = 150f;
        this.peso = 10;
    }

    public Electrodomestico (String color, String consumo_energetico, float precio_base, int peso) {
        this.color = "rojo";
        this.consumo_energetico = "D";
        this.precio_base = 200f;
        this.peso = 15;
    }

    /**
     * Métodos del Controlador
     */

    public String comprobarConsumoEnergetico (String letra) {
        String letra_mayuscula = letra.toUpperCase();

        for (int a = 0; a < Consumos_Energeticos.length; a ++) {
            if (letra_mayuscula.equals(Consumos_Energeticos[a])) {
                letra_correcta_consumo_energetico = letra_mayuscula;
                es_letra_correcta = true;
            }
        }

        if (es_letra_correcta == false) {
            letra_correcta_consumo_energetico =  Constantes.consumo_energetico_por_defecto;
        }

        return letra_correcta_consumo_energetico;
    }

    public String comprobarColor (String colour) {
        String color_minuscula = colour.toLowerCase();

        for (int a = 0; a < Colores_Disponibles.length; a ++) {
            if (color_minuscula.equals(Colores_Disponibles[a])) {
                color_correcto = color_minuscula;
                es_color_correcto = true;
            }
        }

        if (es_color_correcto == false) {
            color_correcto =  Constantes.color_por_defecto;
        }

        return color_correcto;
    }




    public String[] getColores_Disponibles() {
        return Colores_Disponibles;
    }

    public void setColores_Disponibles(String[] colores_Disponibles) {
        Colores_Disponibles = colores_Disponibles;
    }

    public String[] getConsumos_Energeticos() {
        return Consumos_Energeticos;
    }

    public void setConsumos_Energeticos(String[] consumos_Energeticos) {
        Consumos_Energeticos = consumos_Energeticos;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(float precio_final) {
        this.precio_final = precio_final;
    }

    public String getLetra_correcta_consumo_energetico() {
        return letra_correcta_consumo_energetico;
    }

    public void setLetra_correcta_consumo_energetico(String letra_correcta_consumo_energetico) {
        this.letra_correcta_consumo_energetico = letra_correcta_consumo_energetico;
    }
}