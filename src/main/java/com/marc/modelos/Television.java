package com.marc.modelos;

import com.marc.constantes.Constantes;

public class Television extends Electrodomestico {

    private Electrodomestico electrodomestico = new Electrodomestico();

    private float precio_con_30_por_ciento;
    private int resolucion = Constantes.resolucion_por_defecto;
    private boolean sintonizadorTDT = true;
    private boolean es_sintonizadorTDT;

    //Constantes

    //Constantes

    public Television () {
        super();
    }

    public Television (String color, String consumo_energetico, float precio_base, int peso) {
        super(color, consumo_energetico, precio_base, peso);
        this.precio_base = 150f;
        this.peso = 9;
    }

    public Television (String color, String consumo_energetico, float precio_base, int peso, int resolucion, boolean sintonizadorTDT) {
        super(color, consumo_energetico, precio_base, peso);
        this.resolucion = 50;
        this.sintonizadorTDT = true;
    }

    public Television (float precio_base, String consumo_energetico, String color, int peso, int resolucion, boolean sintonizadorTDT) {
        this.precio_base = precio_base;
        this.consumo_energetico = consumo_energetico;
        this.color = color;
        this.peso = peso;
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float precioFinal(int pulgadas, boolean es_sintonizadorTDT) {
        electrodomestico.setPrecio_final(200);

        if (pulgadas > 40) {
            precio_con_30_por_ciento = electrodomestico.getPrecio_final() * (Constantes.treinta_por_ciento);
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + (precio_con_30_por_ciento));
        }

        if (es_sintonizadorTDT) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + Constantes.precio_tv_con_tdt);
        }

        return electrodomestico.getPrecio_final();
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
