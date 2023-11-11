package problemanumero4;

import java.util.*;

public class ProblemaNumero4 {

    public static void main(String[] args) {
 
        //Scanner 
        Scanner entradaDatos = new Scanner(System.in);//ENTRADA DE DATOS 

        //Variables 
        String nombreHuesped;
        int dias = 0;
        double precioUnitario = 0;
        double subtotal = 0;
        double total = 0;
        double descuento = 0;

        //Entrada de Datos 
        //(Mensajes de entrada/saludo) :D
        System.out.println("(Muy buenos dias,tardes o noches.Porfavor,"
                + "ingrese los datos que se le soliciten)");

        //Recolección de Datos :D
        System.out.println("(Ingrese el nombre del Huésped )");
        nombreHuesped = entradaDatos.nextLine();
        System.out.println("(Ingrese los dias que se quedara el huésped)");
        dias = entradaDatos.nextInt();
        System.out.println("(Ingrese el precio por dia de hospedaje)");
        precioUnitario = entradaDatos.nextDouble();

        //Problemas Aritmeticos 
        subtotal = dias * precioUnitario;//SUBTOTAL

        // Condicionales 
        if (dias > 5 && dias < 10) {

            descuento = subtotal * 0.10;//descuento
            total = subtotal - descuento;//TOTAL

        } else {
            if (dias > 10 && dias < 15) {

                descuento = subtotal * 0.15;//descuento
                total = subtotal - descuento;//TOTAL

            } else {
                if (dias > 15) {

                    descuento = subtotal * 0.20;//descuento
                    total = subtotal - descuento;//TOTAL

                }
            }
        }

        //Presentar en pantalla
        System.out.printf("----FACTURA DEL AUTOMOVIL--- \n");
        System.out.printf("|Huésped : %s        \n", nombreHuesped);
        System.out.printf("|Subtotal : %.1f        \n", subtotal);
        System.out.printf("|Descuento : %.1f        \n", descuento);
        System.out.printf("|Total : %.1f        \n", total);

    }

}
        
        
        
   
