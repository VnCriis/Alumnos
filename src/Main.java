import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar 10 estudiantes
        Estudiantes[] estudiantes = new Estudiantes[3];

        // Ingresar datos para 10 estudiantes
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese datos para el estudiante " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Materia: ");
            String materia = scanner.nextLine();


            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            /*scanner.nextInt();*/

            estudiantes[i] = new Estudiantes(nombre, materia,edad);

            System.out.println();
        }

        // Imprimir los datos de todos los estudiantes
        System.out.println("Datos de los estudiantes:");
        for (Estudiantes Estudiantes : estudiantes) {
            Estudiantes.imprimirDatos();
        }


        // Cerrar el scanner
        scanner.close();
    }
}

