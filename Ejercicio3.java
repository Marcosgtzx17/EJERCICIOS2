import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
       
        int[] numeros = new int[12];

        
        int pares = 0;
        int impares = 0;

       
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt(); 

            
            if (numeros[i] % 2 == 0) {
                pares++;   
            } else {
                impares++;  
            }
        }

        
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        sc.close();  
    }
}
