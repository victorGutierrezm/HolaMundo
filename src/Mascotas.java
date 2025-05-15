import java.util.Scanner;

public class Mascotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] mascotas = new String[4][4];

        // Ingresar los nombres de mascotas
        int contador = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese la mascota " + contador + ": ");
                mascotas[i][j] = scanner.nextLine();
                contador++;
            }
        }

        // Mostrar filas y columnas con índices impares
        System.out.println("\nMostrar filas y columnas con índices impares:");
        for (int i = 1; i < 4; i += 2) { // filas con índice impar
            for (int j = 1; j < 4; j += 2) { // columnas con índice impar
                System.out.print(mascotas[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
