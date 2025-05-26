import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt(); 
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];  
            }
            if (numeros[i] < menor) {
                menor = numeros[i];  
            }
        }

      
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        sc.close();  
    }
}
