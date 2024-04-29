package estruturarepeticao;

import java.util.Scanner;

/*
Elabore um programa que leia números inteiros
multiplique por 3 e imprima-o
até quando o usuario quiser
 */
public class EstruturaRepeticaoExercicio {

    public static void main(String[] args) {
        char d = 's';
        int numero;
        Scanner teclado = new Scanner(System.in);
        while (d == 's') {
            System.out.print("Digite um novo número: ");
            numero = teclado.nextInt();
            System.out.println("Resultado: " + numero * 3);
            System.out.print("Deseja continuar?\n[s]Sim\n[n]Não\n>>>");
            d = teclado.next().charAt(0);
            
            
        }// fim do while
        teclado.close();
    }

}
