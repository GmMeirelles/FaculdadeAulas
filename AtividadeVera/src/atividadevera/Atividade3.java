
package atividadevera;

import javax.swing.JOptionPane;


public class Atividade3 {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do fúncionario");
        String idade = JOptionPane.showInputDialog("Digite a idade do fúncionario");
        String salario = JOptionPane.showInputDialog("Digite o salário do fúncionario");
        int idadei = Integer.parseInt(idade);
        double salariod = Double.parseDouble(salario);
        if(idadei > 45){
            double salariobonus = (salariod * 0.05) + salariod;
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalário com bonus de 5%: " + salariobonus);
            
        }else{
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalário: " + salariod);
        }
        
    }
}
