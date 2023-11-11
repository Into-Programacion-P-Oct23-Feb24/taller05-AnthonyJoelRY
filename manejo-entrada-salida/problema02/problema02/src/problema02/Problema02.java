package problema02;
import java.util.*;
public class Problema02 {

    public static void main(String[] args) {
        //Scanner

        Scanner entradaDatos = new Scanner(System.in);

        //Variables 
        double hijo1;
        double hijo2;
        double hijo3;
        double total;

        //Entrada de Datos 
        System.out.println("Ingrese el gasto del primer hijo");
        hijo1 = entradaDatos.nextDouble();
        System.out.println("Ingrese el gasto del sengundo hijo");
        hijo2 = entradaDatos.nextDouble();
        System.out.println("Ingrese el gasto del tercer hijo");
        hijo3 = entradaDatos.nextDouble();

        //Operaciones Aritmeticas 
        total = hijo1 + hijo2 + hijo3;

        //presentar en pantalla 
        System.out.printf("El gasto total es: %.2f \n", total);

    }

}
