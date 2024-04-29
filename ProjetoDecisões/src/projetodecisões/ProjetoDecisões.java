package projetodecisões;

import java.util.Scanner;

/*
Projeto:
Elabore um programa que leia um número inteiro.
Determine se ele é par ou impar.
 */
public class ProjetoDecisões {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número *Inteiro*: ");
        int n = teclado.nextInt();
        int r = n % 2;
        

        //Estrutura de descão
        if (r == 0) {
            System.out.println("\n=== Resultado ===");
            System.out.print(n + " é par");

        }else{
            System.out.println("=== Resultado ===");
            System.out.println(n + " é impar");
            
        }

        teclado.close();
    }

}
