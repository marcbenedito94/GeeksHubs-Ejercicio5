package com.marc.controladores;

import com.marc.constantes.Constantes;
import com.marc.modelos.Electrodomestico;
import com.marc.modelos.Lavadora;
import com.marc.modelos.Television;

public class ElectrodomesticoControlador {
    private Electrodomestico electrodomestico = new Electrodomestico();
    private Lavadora lavadora = new Lavadora();
    private Television television = new Television();

    public float precioFinal (String consumo, int peso) {
        electrodomestico.setPrecio_final(Constantes.precio_final_inicial);
        electrodomestico.comprobarConsumoEnergetico(consumo);

        if (electrodomestico.getLetra_correcta_consumo_energetico().equals("A")) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 100f);

            precioFinalPorPeso(peso);
        } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("B")) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 85f);

            precioFinalPorPeso(peso);
        } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("C")) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 60f);

            precioFinalPorPeso(peso);
        } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("D")) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 50f);

            precioFinalPorPeso(peso);
        } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("E")) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 30f);

            precioFinalPorPeso(peso);
        } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("F")) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 10f);

            precioFinalPorPeso(peso);
        }

        precioFinalPorCarga(lavadora.getCarga());

        //System.out.println("Precio Carga");

        precioFinalPorResolucion(television.getResolucion());

        //System.out.println("Precio Resolucion");

        return electrodomestico.getPrecio_final();
    }

    public float precioFinalPorPeso (int peso) {
        if ((peso >= 1) && (peso <= 19)) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 10f);
            //precio_final += 10;
        } else if ((peso >= 20) && (peso <= 49)) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 50f);
            //precio_final += 50;
        } else if ((peso >= 50) && (peso <= 79)) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 80f);
            //precio_final += 80;
        } else if (peso >= 80) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 100f);
            //precio_final += 100;
        }

        return electrodomestico.getPrecio_final();
    }
    public float precioFinalPorCarga (int carga) {
        if (carga > 30) {
            //System.out.println("Hola " + electrodomestico.getPrecio_final());
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 50f);
        }

        return electrodomestico.getPrecio_final();
    }

    public float precioFinalPorResolucion (int resolucion) {
        if (resolucion > 40) {
            //System.out.println("Hola " + electrodomestico.getPrecio_final());
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + (electrodomestico.getPrecio_final() * Constantes.treinta_por_ciento));
        }

        return electrodomestico.getPrecio_final();
    }
}
