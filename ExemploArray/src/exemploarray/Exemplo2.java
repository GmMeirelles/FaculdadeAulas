package exemploarray;

import java.util.Scanner;

/*
Elabore um programa que leia os valores de 10 salarios
Some-os e exiba o conteudo do array e a soma do total
*/
public class Exemplo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        double[] salarios = new double[10];
        for(int i=0; i<salarios.length;i++){
            int i2 = i+1;
            System.out.println("Digite o " + i2 + " Salario");
            salarios[i] = teclado.nextDouble();
            soma += salarios[i];
        }
        
        System.out.println("Soma dos salarios = R$" + soma);
    }

}
