package exerciciodecisoes;

import java.util.Scanner;

public class ExercicioDecisoes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("Seu número é negativo");
        } else if (n > 0) {
            System.out.println("Seu número é positivo");

        } else {
            System.out.println("Seu número é 0");
        }

    }

}
