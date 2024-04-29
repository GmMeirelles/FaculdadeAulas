
package atividadevera;

import javax.swing.JOptionPane;


public class Atividade4 {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digiute seu nome");
        String anon = JOptionPane.showInputDialog("Digite seu ano de nascimento");
        String anoa = JOptionPane.showInputDialog("Digite o ano atual");
        int anonint = Integer.parseInt(anon);
        int anoaint = Integer.parseInt(anoa);
        int idade = anoaint - anonint;
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade atual: " + idade);
        
        
    }
}
