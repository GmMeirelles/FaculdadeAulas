package exerciciodecisoes2;

import java.util.Scanner;

public class ExDecisoes2Switch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("==== Código do Produto ====");
        System.out.print("Digite o código do produto: ");
        int cp = teclado.nextInt();

        switch (cp) {
            case 110:
                System.out.println("Produto identificado como Borracha");
                break;

            case 123:
                System.out.println("Produto identificado como Caneta");
                break;

            case 23:
                System.out.println("Produto identificado como Caderno");
                break;

            case 234:
                System.out.println("Produto identificado como Cola");
                break;

            case 455:
                System.out.println("Produto identificado como Lapis");
                break;

            default:
                System.out.println("Código Inválido.");

        }
        teclado.close();
    }

}
