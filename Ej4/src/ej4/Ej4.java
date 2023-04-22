package ej4;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Ingrese un numero para calcular su raiz cuadrada: ");
        double numero = teclado.nextDouble();
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de " + numero + " es " + raiz);

    }
    
}
