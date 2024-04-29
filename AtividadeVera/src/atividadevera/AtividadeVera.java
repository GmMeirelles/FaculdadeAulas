
package atividadevera;

import javax.swing.JOptionPane;


public class AtividadeVera {

    
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite um valor");
        int n1 = Integer.parseInt(valor);
        
        JOptionPane.showMessageDialog(null, n1 + " x 2 = " + n1*2);
        
    }
    
}
