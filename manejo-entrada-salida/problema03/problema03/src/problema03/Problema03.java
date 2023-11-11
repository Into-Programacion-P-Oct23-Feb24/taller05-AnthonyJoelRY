package problema03;

import java.util.Scanner;

public class Problema03 {

    public static void main(String[] args) {
          //Scanner

        Scanner entradaDatos = new Scanner(System.in);

        //Variables 
        double telefonoMinutos;
        double minutosGastados;
        double total;

        //Entrada de Datos 
        System.out.println("Ingrese el precio por minutos ");
        telefonoMinutos = entradaDatos.nextDouble();
        System.out.println("Ingrese los minutos gastados en el mes");
        minutosGastados = entradaDatos.nextDouble();


        //Operaciones Aritmeticas 
        total = telefonoMinutos*minutosGastados;

        //presentar en pantalla 
        System.out.printf( "El gasto total es: %.2f \n", total);

    }

}
