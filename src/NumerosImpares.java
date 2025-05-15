
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        // Solicitar un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        numero = entrada.nextInt();

        // Validar que sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            int i = 1;
            System.out.println("Números impares entre 0 y " + numero + ":");
            // Utilizar while para recorrer desde 1 hasta el número ingresado
            while (i <= numero) {
                // Si el número es impar
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        entrada.close();
    }
}
