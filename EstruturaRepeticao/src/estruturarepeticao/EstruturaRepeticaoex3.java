
package estruturarepeticao;

import java.util.Scanner;

/*
escreva um programa que leia 3 números inteiros
multiplique por 2 e exiba-o
*/

public class EstruturaRepeticaoex3 {
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int contador = 1;
        int n;
        while(contador <=3){
            System.out.println("Digite um número");
            n = teclado.nextInt();
            n*=2;
            System.out.println("----------\nResultado: "+n+"\n----------");
            contador+=1;
            
        }        
        teclado.close();
    }
    
}
