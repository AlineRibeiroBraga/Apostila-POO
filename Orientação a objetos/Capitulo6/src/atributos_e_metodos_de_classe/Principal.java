package atributos_e_metodos_de_classe;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        System.out.println(Funcionario.getValeRefeicao());

        Funcionario.reajusteTaxa(Double.parseDouble(JOptionPane.showInputDialog(null,"Taxa de ajuste (%)")));
        System.out.println(Funcionario.getValeRefeicao());
    }
}
