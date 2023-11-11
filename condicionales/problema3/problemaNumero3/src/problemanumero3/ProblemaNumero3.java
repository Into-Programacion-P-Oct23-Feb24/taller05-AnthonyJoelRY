package problemanumero3;

import java.util.*;

public class ProblemaNumero3 {

    public static void main(String[] args) {
 
        //Scanner 
        Scanner entradaDatos = new Scanner(System.in);//ENTRADA DE DATOS 

        //Variables 
        String marca;
        String origen;
        double costo = 0;
        double subtotal = 0;
        double total = 0;
        double impuesto = 0;

        //Entrada de Datos 
        //(Mensajes de entrada/saludo) :D
        System.out.println("(Muy buenos dias,tardes o noches.Porfavor,"
                + "ingrese los datos que se le soliciten)");

        //Recolección de Datos :D
        System.out.println("(Ingrese la marca del Automovil )");
        marca = entradaDatos.nextLine();
        System.out.println("(Ingrese el pais de origen del Automovil(Opciones:"
                + " Alemania,Japon,Italia,USA)");
        origen = entradaDatos.nextLine();
        System.out.println("(Ingrese el costo del Automovil)");
        costo = entradaDatos.nextDouble();

        //Problemas Aritmeticos 
        subtotal = costo;//SUBTOTAL

        // Condicionales 
        if (origen.equals("Alemania")) {

            impuesto = subtotal * 0.20;//impuesto
            total = subtotal + impuesto;//TOTAL

        } else {
            if (origen.equals("Japon")) {

                impuesto = subtotal * 0.30;//impuesto
                total = subtotal + impuesto;//TOTAL

            } else {
                if (origen.equals("Italia")) {

                    impuesto = subtotal * 0.15;//impuesto
                    total = subtotal + impuesto;//TOTAL

                } else {
                    if (origen.equals("USA")) {

                        impuesto = subtotal * 0.08;//impuesto
                        total = subtotal + impuesto;//TOTAL

                    }
                }
            }
        }

        //Presentar en pantalla
        System.out.printf("----FACTURA DEL AUTOMOVIL--- \n");
        System.out.printf("|Subtotal : %.1f        \n", subtotal);
        System.out.printf("|Impuesto por el pais de %s : %.1f        \n",
                origen, impuesto);
        System.out.printf("|Total : %s        \n", total);
        System.out.printf("|Marca del vehiculo : %s        \n", marca);
    }

}
