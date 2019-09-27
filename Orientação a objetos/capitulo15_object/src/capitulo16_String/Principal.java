package capitulo16_String;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        String nome1 = "Aline Ribeiro";
        String nome2 = "Alice Ribeiro";

        JOptionPane.showMessageDialog(null,nome1);
        JOptionPane.showMessageDialog(null,nome2);

        JOptionPane.showMessageDialog(null,nome1 == nome2);
        JOptionPane.showMessageDialog(null,nome1.equals(nome2));

        String nome3 = new String( "Angelica Ribeiro");
        String nome4 = new String("Angelica Ribeiro");

        JOptionPane.showMessageDialog(null,nome3);
        JOptionPane.showMessageDialog(null,nome4);

        JOptionPane.showMessageDialog(null,nome3 == nome4);
        JOptionPane.showMessageDialog(null,nome3.equals(nome4));

        String[] vetor = nome1.split("i");

        for(String valor:vetor){
            JOptionPane.showMessageDialog(null,valor);
        }
    }
}
