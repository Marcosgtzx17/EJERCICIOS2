import java.util.Scanner;
public class Ejercicio {
     public static void main(String[] args) {
       
        String[] frutas = new String[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingresa la fruta #" + (i + 1) + ": ");
            frutas[i] = sc.nextLine();
        }

        System.out.println("\nFrutas en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        sc.close();
    }


}

