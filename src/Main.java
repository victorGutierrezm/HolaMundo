import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir la matriz para 4x4 estudiantes
        String[][] estudiante = new String[4][4];

        System.out.println("Ingrese los nombres de los estudiantes:");

        // Bucle para ingresar nombres en la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Nombre en la posición " + i + "," + j + ":");
                estudiante[i][j] = scanner.nextLine();
            }
        }

        // Opcional: mostrar los nombres ingresados
        System.out.println("\nNombres ingresados:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Estudiante en [" + i + "," + j + "]: " + estudiante[i][j]);
            }
        }

        scanner.close();
    }
}