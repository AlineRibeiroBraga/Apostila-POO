package capitulo7_encapsulamento;
import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        Conta c1 = new Conta();

        c1.setNumero("1234-6");
        c1.setAgencia("231-65");
        c1.setSaldo(2500);

        c1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo")));
        JOptionPane.showMessageDialog(null, "Número da conta: " + c1.getNumero() + "\nAgência: "
                + c1.getAgencia() + "\nSaldo: R$" + c1.getSaldo());
    }
}
