import java.util.Scanner;

public class TipoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los puntos del cliente: ");
        int puntos = scanner.nextInt();

        if (puntos < 1000) {
            System.out.println("El cliente es Bronce");
        } else if (puntos >= 1000 && puntos <= 3000) {
            System.out.println("El cliente es Plata");
        } else {
            System.out.println("El cliente es Oro");
        }

        scanner.close();
    }
}