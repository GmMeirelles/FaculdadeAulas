
package exemplosfor;

import java.util.Scanner;


public class Exemplo4 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor final");
        int cont = 0;
        int fim = teclado.nextInt();
        System.out.println("---------------------");
        for(int a=2;a <= fim;a+=2){
            System.out.print(a+"\t");
            cont++;
            if (cont == 10){
                System.out.println("");
                cont = 0;
            }
        }
        
    }
}
