package projetofuncionario;

import java.util.Scanner;

/*
* Elaborar um projeto que leia
* Nome, Idade, Cpf, Salário
* Realize o desconto do plano de saúde (5% do salário)
 */
public class ProjetoFuncionario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade:");
        int idade = teclado.nextInt();
        System.out.println("Digite o CPF:");
        long cpf = teclado.nextLong();
        System.out.println("Digite o salário bruto:");
        float salario = teclado.nextFloat();
        
        // Calculo do desconto do plano de saúde
        float salarioDesconto = salario - salario * 0.05F;
        
        // Saída
        System.out.println("====== Cadastro ======");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario bruto:G " + salario);
        System.out.println("Salario Liquido: " + salarioDesconto);
        teclado.close();

    }

}
