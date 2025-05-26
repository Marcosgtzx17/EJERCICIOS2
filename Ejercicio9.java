import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntajeNivel1 = 30;
        int puntajeNivel2 = 0;

        System.out.println("Nivel 2 - Pregunta 1:");
        System.out.println("¿2 + 2 = ?");
        System.out.println("a) 3\nb) 4\nc) 5\nd) 6");
        String r1 = scanner.nextLine();

        if (r1.equalsIgnoreCase("b")) {
            puntajeNivel2 += 20;
        } else {
            puntajeNivel2 -= 10;
        }


          // Pregunta 2
        System.out.println("2. ¿Cuánto es 8 * 5?");
        System.out.println("a) 54\nb) 40b\nc) 58\nd) 60");
        String respuesta2 = scanner.nextLine();
        if (respuesta2.equalsIgnoreCase("b")) {
            puntajeNivel2 += 20;
        } else {
            puntajeNivel2 -= 10;
        }

        // Pregunta 3
        System.out.println("3. ¿Qué planeta es conocido como el planeta rojo?");
        System.out.println("a) Tierra\nb) Júpiter\nc) Marte\nd) Saturno");
        String respuesta3 = scanner.nextLine();
        if (respuesta3.equalsIgnoreCase("c")) {
            puntajeNivel2 += 20;
        } else {
            puntajeNivel2 -= 10;
        }

        // Pregunta 4
        System.out.println("4. ¿Quién descubrio america?");
        System.out.println("a) Cristobal Colon\nb) Miguel de Cervantes\nc) Lope de Vega\nd) Pablo Neruda");
        String respuesta4 = scanner.nextLine();
        if (respuesta4.equalsIgnoreCase("a")) {
            puntajeNivel2 += 20;
        } else {
            puntajeNivel2 -= 10;
        }

        // Mostrar resultados
        System.out.println("\nPuntaje obtenido en Nivel 2: " + puntajeNivel2);

        int puntajeTotal = puntajeNivel1 + puntajeNivel2;

        System.out.println("PUNTAJE TOTAL ACUMULADO: " + puntajeTotal);

        scanner.close();
    }
}