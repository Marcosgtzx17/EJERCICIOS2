import java.util.Scanner;
public class Ejercicio2 {
 public static void main(String[] args) {
        
        int[] numeros = new int[12];

       
        Scanner sc = new Scanner(System.in);

        
        int suma = 0;

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();       
            suma += numeros[i];             
        }

        
        double promedio = (double) suma / numeros.length;

        
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);
         sc.close();  
    }
}
