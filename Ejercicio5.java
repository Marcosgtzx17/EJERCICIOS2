import java.util.Scanner;

public class Ejercicio5 {
 public static void main(String[] args) {
       
        String[][] articulos = new String[3][3];

       
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Ingrese los nombres de 9 artículos:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Artículo [" + fila + "][" + col + "]: ");
                articulos[fila][col] = sc.nextLine();
            }
        }

        System.out.println("\nContenido de la matriz con las filas en orden invertido:\n");

        
        for (int fila = 2; fila >= 0; fila--) {  
            for (int col = 0; col < 3; col++) {
                System.out.print(articulos[fila][col] + "\t");
            }
            System.out.println(); 
        }

        sc.close();  
    }
}