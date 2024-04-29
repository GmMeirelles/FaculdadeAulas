package calculadora;

import java.util.Scanner;

/*
Usuario vai digitar dois números
e vai escolher a operação que deseja utilizar
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {//Loop infinito
            System.out.println("=== Calculadora ===");
            System.out.print("[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Sair\n>> ");

            byte o = teclado.nextByte();

            float n1, n2, r;

            switch (o) {
                case 1:
                    System.out.println("\nDigite dois números");
                    n1 = teclado.nextFloat();
                    n2 = teclado.nextFloat();
                    r = n1 + n2;
                    System.out.println("Resultado = " + r);
                    break;

                case 2:
                    System.out.println("\nDigite dois números");
                    n1 = teclado.nextFloat();
                    n2 = teclado.nextFloat();
                    r = n1 - n2;
                    System.out.println("Resultado = " + r);
                    break;

                case 3:
                    System.out.println("\nDigite dois números");
                    n1 = teclado.nextFloat();
                    n2 = teclado.nextFloat();
                    r = n1 * n2;
                    System.out.println("Resultado = " + r);
                    break;

                case 4:
                    System.out.println("\nDigite dois números");
                    n1 = teclado.nextFloat();
                    n2 = teclado.nextFloat();
                    if (n2 == 0) {
                        System.out.println("Nenhum número é divisivel por 0");
                        System.out.print("Digite outro número\n>> ");
                        n2 = teclado.nextFloat();
                        r = n1 / n2;
                        System.out.println("Resultado = " + r);

                    } else {
                        r = n1 / n2;
                        System.out.println("Resultado = " + r);
                    }
                    break;
                case 5:
                    teclado.close();
                    System.exit(0); //Encerra o programa
                    break;

                default:
                    System.out.println("Operação inválida");
            }//Fim do switch
        }//Fim do while
        

    }

}
