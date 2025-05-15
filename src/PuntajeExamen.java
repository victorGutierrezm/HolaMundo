import java.util.Scanner;

public class PuntajeExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Respuestas correctas: ");
        int correctas = scanner.nextInt();

        System.out.print("Respuestas incorrectas: ");
        int incorrectas = scanner.nextInt();

        System.out.print("Respuestas vacías: ");
        int vacias = scanner.nextInt();

        int puntaje = (correctas * 5) + (incorrectas * -2) + (vacias * 0);
        System.out.println("El puntaje total del estudiante es: " + puntaje);

        scanner.close();
    }
}

