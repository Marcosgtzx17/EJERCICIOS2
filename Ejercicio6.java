import java.util.Scanner;

public class Ejercicio6 {
 public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];

        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Ingrese 9 valores numéricos para la matriz:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Elemento [" + fila + "][" + col + "]: ");
                matriz[fila][col] = sc.nextInt();
            }
        }

        
        System.out.println("\nMatriz original:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transpuesta:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
              
                System.out.print(matriz[col][fila] + "\t");
            }
            System.out.println();
        }

        sc.close(); 
    }
}
