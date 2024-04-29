
package atividadevera;

import javax.swing.JOptionPane;


public class Exercicio2 {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do fúncionario");
        String sal = JOptionPane.showInputDialog("Digite o salario do fúncionario");
        double salf = Double.parseDouble(sal);
        double saldesconto = (salf * 0.10) + salf;
        
        JOptionPane.showMessageDialog(null, "Salário de " + nome +  " com desconto de 10%\n>> " + saldesconto);
        
    }
}
