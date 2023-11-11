package problema01;
import java.util.*;
public class Problema01 {

    public static void main(String[] args) {

        //Scanner 
        Scanner entradaDatos = new Scanner(System.in);

        //variables 
        double base;
        double altura;
        double area;

        //entrada de datos 
        System.out.println("Ingrese la base del triangulo");
        base = entradaDatos.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entradaDatos.nextDouble();

        //operaciónes aritmeticas 
        area = (base * altura)/2;

        //Presentar en pantalla
        System.out.printf("El area del triangulo es : %.2f \n", area);

    }

}
