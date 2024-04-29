package com.mycompany.exercicio4vera;


public class Exercicio4Vera {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.nome = "Eduardo";
        float a = a1.nota1 = 7f;
        float b = a1.nota2 = 9f;
        float m = a1.media(a, b);
        
        System.out.println("nome: " + a1.nome);
        System.out.println("nota 1: " + a1.nota1);
        System.out.println("nota 2: " + a1.nota2);
        System.out.println("media: " + m);
        
        Gatos g1 = new Gatos();
        g1.nome = "Geraldo";
        g1.peso = 2.0;
        
        System.out.println("Nome do felino: " + g1.nome);
        System.out.println("Peso do meliante: " + g1.peso);
        
    }
}
