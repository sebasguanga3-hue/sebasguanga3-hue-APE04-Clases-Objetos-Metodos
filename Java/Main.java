import java.util.Scanner;

public class Main {

    // Método para validar notas
    public static double validarNota(Scanner sc) {

        double nota;

        do {

            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.print(
                    "Error. Ingrese una nota entre 0 y 10: "
                );
            }

        } while (nota < 0 || nota > 10);

        return nota;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudiante[] estudiantes =
            new Estudiante[5];

        int aprobados = 0;
        int reprobados = 0;

        // Registro de estudiantes
        for (int i = 0; i < 5; i++) {

            System.out.println(
                "\n===== ESTUDIANTE " +
                (i + 1) + " ====="
            );

            System.out.print("Cedula: ");
            String cedula = sc.next();

            System.out.print("Nombre: ");
            String nombre = sc.next();

            System.out.print("Apellido: ");
            String apellido = sc.next();

            System.out.print("Nota 1: ");
            double n1 = validarNota(sc);

            System.out.print("Nota 2: ");
            double n2 = validarNota(sc);

            System.out.print("Nota 3: ");
            double n3 = validarNota(sc);

            estudiantes[i] = new Estudiante(
                cedula,
                nombre,
                apellido,
                n1,
                n2,
                n3
            );

            if (estudiantes[i]
                .getPromedio() >= 7) {

                aprobados++;

            } else {

                reprobados++;
            }
        }

        // Mostrar estudiantes
        System.out.println(
            "\n===== LISTADO DE ESTUDIANTES ====="
        );

        for (int i = 0; i < 5; i++) {

            estudiantes[i]
                .mostrarInformacion();
        }

        // Mostrar resultados
        System.out.println(
            "\n======================"
        );

        System.out.println(
            "Aprobados: " + aprobados
        );

        System.out.println(
            "Reprobados: " + reprobados
        );

        sc.close();
    }
}