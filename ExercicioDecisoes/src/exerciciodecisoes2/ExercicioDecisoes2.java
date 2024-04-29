package exerciciodecisoes2;

import java.util.Scanner;

public class ExercicioDecisoes2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("==== Código do Produto ====");
        System.out.print("Digite o código do produto: ");
        int cp = teclado.nextInt();

        if (cp == 110) {
            System.out.println("Produto identificado como Borracha");

        } else if (cp == 123) {
            System.out.println("Produto identificado como Caneta");

        } else if (cp == 23) {
            System.out.println("Produto identificado como Caderno");

        } else if (cp == 234) {
            System.out.println("Produto identificado como Cola");

        } else if (cp == 455) {
            System.out.println("Produto identificado como Lápis");

        } else {
            System.out.println("Produto não identificado");

        }
        teclado.close();

    }
}
