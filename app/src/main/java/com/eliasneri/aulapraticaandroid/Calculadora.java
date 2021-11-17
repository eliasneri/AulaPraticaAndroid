package com.eliasneri.aulapraticaandroid;

public class Calculadora {

    public static String calcula(double txgasolina, double etanol){
        String saida = "";

        double quociente = etanol / txgasolina;

        if (quociente <= 0.7) {
            saida = "o ETANOL está mais vantajoso";
        }
        else
        {
            saida = "a GASOLINA está mais vantajosa"
        }

        return saida;
    }

}
