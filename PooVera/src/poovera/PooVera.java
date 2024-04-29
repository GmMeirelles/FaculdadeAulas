package poovera;

import java.util.Scanner;


public class PooVera {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        
        System.out.println("Digite em ordem seu Ano de nascimento, Salário, Nome");
        f1.anonasc = teclado.nextInt();
        f1.salario = teclado.nextDouble();
        f1.nome = teclado.next();
        
        
    }
    
}
