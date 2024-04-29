package exercicio;

/*
Elabore um programa em Java
que leia um número inteiro
determine o antecessor e o sucessor e exiba-os no console.
*/

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        
        //Processo
        int ant = num - 1;
        int suc = num + 1;
        
        //Saída
        System.out.println("Sucessor: " + suc);
        System.out.println("Seu número: " + num);
        System.out.println("Antecessor: " + ant);
        teclado.close();
        
    }
    
}
