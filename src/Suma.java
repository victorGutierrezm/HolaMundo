import java.util.Scanner;

public class Suma {
    public  static void main (String[] args)
    {
        //instancia de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        double num1,num2, suma;
        //captura de datos
        System.out.println("Escriba el primer numero");
        num1 = Double.parseDouble(entrada.next());

        System.out.println("Escriba el primer numero");
        num2 = entrada.nextDouble();

        //operar el resultado
        suma = num1 + num2;

        //mostrar el resultado
        System.out.println("");
        System.out.println("la suma de los numeros  es:" + suma);

    }
}
