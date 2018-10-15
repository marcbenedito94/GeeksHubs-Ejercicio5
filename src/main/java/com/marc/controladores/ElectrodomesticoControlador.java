package com.marc.controladores;

import com.marc.modelos.Electrodomestico;
import com.marc.modelos.Lavadora;

public class ElectrodomesticoControlador {
    private Electrodomestico electrodomestico = new Electrodomestico();

    public float precioFinal (String consumo, int peso) {
        electrodomestico.comprobarConsumoEnergetico(consumo);

            if (electrodomestico.getLetra_correcta_consumo_energetico().equals("A")) {
                electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 100);

                precioFinalPorPeso(peso);
            } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("B")) {
                electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 85);

                precioFinalPorPeso(peso);
            } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("C")) {
                electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 60);

                precioFinalPorPeso(peso);
            } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("D")) {
                electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 50);

                precioFinalPorPeso(peso);
            } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("E")) {
                electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 30);

                precioFinalPorPeso(peso);
            } else if (electrodomestico.getLetra_correcta_consumo_energetico().equals("F")) {
                electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 10);

                precioFinalPorPeso(peso);
            }

            //precioFinalPorCarga(carga);

        return electrodomestico.getPrecio_final();
    }

    public float precioFinalPorPeso (int peso) {
        if ((peso >= 1) && (peso <= 19)) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 10);
            //precio_final += 10;
        } else if ((peso >= 20) && (peso <= 49)) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 50);
            //precio_final += 50;
        } else if ((peso >= 50) && (peso <= 79)) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 80);
            //precio_final += 80;
        } else if (peso >= 80) {
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 100);
            //precio_final += 100;
        }

        return electrodomestico.getPrecio_final();
    }
    public void precioFinalPorCarga (int carga) {
        if (carga > 30) {
            //System.out.println("Hola " + electrodomestico.getPrecio_final());
            electrodomestico.setPrecio_final(electrodomestico.getPrecio_final() + 50);
        }
    }
}
