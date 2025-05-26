import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
      
        int[][] matriz = new int[3][4];

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Ingrese 12 valores numéricos para la matriz:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Elemento [" + fila + "][" + col + "]: ");
                matriz[fila][col] = sc.nextInt();
            }
        }

        
        System.out.println("\nMatriz ingresada:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

       
        boolean encontrado = false;

        for (int fila = 0; fila < 3; fila++) {
         
            int minCol = 0;

           
            for (int col = 1; col < 4; col++) {
                if (matriz[fila][col] < matriz[fila][minCol]) {
                    minCol = col;
                }
            }

       
            boolean esPuntoSilla = true;
            for (int f = 0; f < 3; f++) {
                if (matriz[f][minCol] > matriz[fila][minCol]) {
                    esPuntoSilla = false;
                    break;
                }
            }

            if (esPuntoSilla) {
                System.out.println("Punto de silla encontrado:");
                System.out.println("Valor: " + matriz[fila][minCol]);
                System.out.println("Posición: [" + fila + "][" + minCol + "]");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println(" No se encontró ningún punto de silla en la matriz.");
        }

        sc.close();
    }
}
