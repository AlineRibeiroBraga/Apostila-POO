package capitulo11_interfaces;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();

        conta1.Deposita(Double.parseDouble(JOptionPane.showInputDialog(null,"Valor")));
        conta1.Sacar(Double.parseDouble(JOptionPane.showInputDialog(null,"Valor")));
        JOptionPane.showMessageDialog(null,String.valueOf(conta1.getSaldo()));
    }
}
