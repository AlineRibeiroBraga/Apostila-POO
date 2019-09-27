package capitulo12_pacotes.testes;

import capitulo12_pacotes.sistema.Conta;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.depositar(1520);
        JOptionPane.showMessageDialog(null,conta1.getSaldo());
    }

}
