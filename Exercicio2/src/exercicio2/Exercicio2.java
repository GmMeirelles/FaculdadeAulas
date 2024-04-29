
package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        // Entrada
        System.out.println("Digite uma temperatura em Graus Célcius");
        float C = teclado.nextFloat();
        
        // Processo
        float F = (C * 9/5) + 32;
        
        //Saída
        System.out.println("=== Conversão ===");
        System.out.println("Celcius: " + C + "*C");
        System.out.println("Fahrenheit: " + F + "*F");
        teclado.close();
        
    }
    
}
