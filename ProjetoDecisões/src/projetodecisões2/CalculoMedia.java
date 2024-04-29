package projetodecisões2;

import java.util.Scanner;

/*
Elabore um programa que leia 2 notas de prova
Calcule a média simples
Determine se o aluno foi reprovado(<4), aprovado(>6) ou aluno de recuperação
 */
public class CalculoMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite duas notas: ");
        double n1 = teclado.nextDouble();
        Double n2 = teclado.nextDouble();
        double m = (n1 + n2) / 2;

        //Avaliar situação
        if (m >= 6) {
            System.out.println("Aluno Aprovado");
        } else if (m <= 4) {
            System.out.println("Aluno Reprovado");
        } else {
            System.out.println("Aluno de Recuperação");
        }
        
        teclado.close();
    }
}
