package capitulo10_classesAbstratas;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Gerente g = new Gerente();

        g.setNome(coletarDados("Nome"));
        g.setSalario(Double.parseDouble(coletarDados("Salário:")));
        g.setUsuario(coletarDados("Usuário"));
        g.setSenha(coletarDados("Senha"));
        g.bonificação();
    }

    private static String coletarDados(String texto) {
        return JOptionPane.showInputDialog(null,texto);
    }

}
