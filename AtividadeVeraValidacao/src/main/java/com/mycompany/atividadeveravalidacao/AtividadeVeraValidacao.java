package com.mycompany.atividadeveravalidacao;

import java.util.Scanner;


public class AtividadeVeraValidacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1;
        do{
            System.out.println("Digite uma nota");
            nota1 = teclado.nextFloat();
        }while(nota1 < 0 || nota1 > 10 );
            System.out.println(nota1);
        
        
        
    }
}
