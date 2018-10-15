package com.marc.modelos;

import com.marc.constantes.Constantes;

public class Lavadora extends Electrodomestico {
    private Electrodomestico electrodomestico = new Electrodomestico();

    private int carga = Constantes.carga_por_defecto;

    public Lavadora () {
        super();
    }

    public Lavadora (String color, String consumo_energetico, float precio_base, int peso, int carga) {
        super(color, consumo_energetico, precio_base, peso);
    }

    public Lavadora (String color, String consumo_energetico, float precio_base, int peso) {
        super(color, consumo_energetico, precio_base, peso);
        this.precio_base = 680f;
        this.peso = 72;
    }

    public Lavadora (float precio_base, String consumo_energetico, String color, int peso, int carga) {
        this.precio_base = precio_base;
        this.consumo_energetico = consumo_energetico;
        this.color = color;
        this.peso = peso;
        this.carga = carga;
    }

    //Metodos del Controlador
    public float precioFinal (String consumo, int peso, int carga) {
        if (carga >= 30) {
            //System.out.println("Hola " + electrodomestico.getPrecio_final());
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 50);
        }
        return electrodomestico.getPrecio_final();
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
