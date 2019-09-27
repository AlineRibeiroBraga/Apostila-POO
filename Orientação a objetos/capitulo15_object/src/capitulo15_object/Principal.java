package capitulo15_object;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Aline",1800);

        JOptionPane.showMessageDialog(null,funcionario);

        Funcionario funcionario2 = new Funcionario("Aline",1800);

        JOptionPane.showMessageDialog(null,funcionario2);

        JOptionPane.showMessageDialog(null,funcionario == funcionario2);
        JOptionPane.showMessageDialog(null,funcionario.equals(funcionario.equals(funcionario2)));
    }

}
