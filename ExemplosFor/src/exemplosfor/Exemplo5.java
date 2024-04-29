
package exemplosfor;

import java.util.Scanner;


public class Exemplo5 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra = 65;
        System.out.println("Letra atual: A\n==============");
        for(int cont = 0;cont <=24;cont++){
            System.out.println("Deseja continuar?\n[1] Sim\n[2] Não");
            int desc = teclado.nextInt();
            if(desc == 1){
                letra+=1;
                char letral = letra;
                System.out.println("Letra atual: " + letral + "\n==============");
            }else{
            cont = 27;
            }
            
        }
    }
}
