/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadevera;

import javax.swing.JOptionPane;

/**
 *
 * @author 12524134960
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        String sn1 = JOptionPane.showInputDialog("Digite uma nota");
        String sn2 = JOptionPane.showInputDialog("Digite outra nota");
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        
        JOptionPane.showMessageDialog(null, nome + " Teve a média de " + (n1+n2)/2);
        
        
    }
    
}
