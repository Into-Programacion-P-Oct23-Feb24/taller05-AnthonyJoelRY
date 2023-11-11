package problemanumero2;

import java.util.*;

public class ProblemaNumero2 {

    public static void main(String[] args) {

        //Scanner 
        Scanner entradaDatos = new Scanner(System.in);//ENTRADA DE DATOS 

        //Variables 
        String nombreProducto;
        double costoPedidoUnitario = 0;
        double cantidadProducto = 0;
        double descuento = 0;
        double subtotal = 0;
        double total = 0;

        //Entrada de Datos 
        //(Mensajes de entrada/saludo) :D
        System.out.println("(Muy buenos dias,tardes o noches.Porfavor,"
                + "ingrese los datos que se le soliciten)");

        //Recolección de Datos :D
        System.out.println("(Ingrese el nombre del producto )");
        nombreProducto = entradaDatos.nextLine();
        System.out.println("(Ingrese el costo del pedido (!unitario¡))");
        costoPedidoUnitario = entradaDatos.nextDouble();// COSTO DEL PEDIDO UNIT
        System.out.println("(Ingrese la cantidad del producto )");
        cantidadProducto = entradaDatos.nextDouble();//CANTIDAD DEL PRODUCTO

        //Problemas Aritmeticos 
        subtotal = cantidadProducto * costoPedidoUnitario;//SUBTOTAL

        // Condicionales 
        if (cantidadProducto > 50) {

            descuento = subtotal * 0.15;//DESCUENTO
            total = subtotal - descuento;//TOTAL

        }

        //Presentar en pantalla
        System.out.printf("----FACTURA DE COMPRA--- \n");
        System.out.printf("|Subtotal: %.1f        \n", subtotal);
        System.out.printf("|Descuento: %.1f       \n", descuento);
        System.out.printf("|Total a pagar : %.1f  \n", total);
        System.out.printf("|Cantidad producto : %.1f  \n", cantidadProducto);
        System.out.printf("|Nombre del producto : %s  \n", nombreProducto);

    }

}
