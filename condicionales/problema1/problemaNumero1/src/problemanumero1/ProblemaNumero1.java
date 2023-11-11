package problemanumero1;

import java.util.*;

public class ProblemaNumero1 {
    
    public static void main(String[] args) {
 
        //Scanner 
        Scanner entradaDatos = new Scanner(System.in);//ENTRADA DE DATOS 

        //Variables 
        double costoKilovatioHora = 0;
        double kilovatiosConsumidoMes = 0;
        double edad = 0;
        double descuento = 0;
        double subtotal = 0;
        double total = 0;

        //Entrada de Datos 
        //(Mensajes de entrada/saludo) :D
        System.out.println("(Muy buenos dias,tardes o noches.Porfavor,"
                + "ingrese los datos que se le soliciten)");

        //Recolección de Datos :D
        System.out.println("(Ingrese su edad)");
        edad = entradaDatos.nextDouble();
        System.out.println("(Ingrese el costo por kilovatio/Hora)");
        costoKilovatioHora = entradaDatos.nextDouble();// COSTO POR KILOVATIOS/HORA
        System.out.println("(Ingrese el consumo de kilovatios al mes)");
        kilovatiosConsumidoMes = entradaDatos.nextDouble();//KILOVATIOS CONSUMIDOS 

        //Problemas Aritmeticos 
        subtotal = costoKilovatioHora * kilovatiosConsumidoMes;//SUBTOTAL

        // Condicionales 
        if (edad > 65) {

            descuento = subtotal * 0.10;//DESCUENTO
            total = subtotal - descuento;//TOTAL

        }

        //Presentar en pantalla
        System.out.printf("---FACTURA DE LA LUZ--- \n");
        System.out.printf("|Subtotal: %.2f        |\n", subtotal);
        System.out.printf("|Descuento: %.2f       |\n", descuento);
        System.out.printf("|Total a pagar : %.2f  |\n", total);

    }

}
