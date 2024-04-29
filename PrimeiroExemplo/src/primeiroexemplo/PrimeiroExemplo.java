package primeiroexemplo;

import java.util.Scanner;

public class PrimeiroExemplo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaração de variavel e atribuição de valores
        System.out.println("Digite dois números inteiros: ");
        int a = teclado.nextInt();//a=7 Atribuição de valores
        int b = teclado.nextInt();
        int c = a + b;//Processo

        System.out.println(a + " + " + b + " = " + c);
        teclado.close();
    }

}
