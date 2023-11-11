package problema04;
import java.util.*;
public class Problema04 {

    public static void main(String[] args) {
        
        //Scanner 
        Scanner entradaDatos = new Scanner(System.in);

        //variable 
        double cpu;
        double raton;
        double pantalla;
        double teclado;
        double total;

        //Entrada de Datos 
        System.out.println("Ingrese el precio del cpu");
        cpu = entradaDatos.nextDouble();
        System.out.println("Ingrese el precio del teclado ");
        teclado = entradaDatos.nextDouble();
        System.out.println("Ingrese el precop de la pantalla ");
        pantalla = entradaDatos.nextDouble();
        System.out.println("Ingrese el precio del raton ");
        raton = entradaDatos.nextDouble();

        //procesos aritmeticos 
        total = cpu + raton + pantalla + teclado;

        //presentar en pantalla 
        System.out.printf("El valor de la pc total es: %.2f \n", total);

        
    }
    
}
