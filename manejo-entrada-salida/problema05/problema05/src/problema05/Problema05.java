package problema05;

import java.util.*;

public class Problema05 {

    public static void main(String[] args) {
  
        //Scanner 
        Scanner entradaDatos = new Scanner(System.in);

        //variable 
        double spotify;
        double dropbox;
        double youtubePremiun;
        double netflix;
        double edad = 0;
        double descuento = 0;
        double total = 0;

        //Entrada de Datos 
        System.out.println("Ingrese su edad");
        edad = entradaDatos.nextDouble();
        System.out.println("Ingrese el precio del spotify");
        spotify = entradaDatos.nextDouble();
        System.out.println("Ingrese el precio del dropbox ");
        dropbox = entradaDatos.nextDouble();
        System.out.println("Ingrese el precop de la netflix ");
        netflix = entradaDatos.nextDouble();
        System.out.println("Ingrese el precio del youtube Premiun ");
        youtubePremiun = entradaDatos.nextDouble();

        //procesos aritmeticos 
        total = youtubePremiun + spotify + dropbox + netflix;
        if (edad > 30) {
            descuento = total * 0.20;
            total = total - descuento;
        }
        System.out.printf("El valor a pagar mesual es: %.2f \n", total);

    }

}
