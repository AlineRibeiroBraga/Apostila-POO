package capitulo9_polimosfismo;

import javax.swing.*;
import java.util.DoubleSummaryStatistics;

public class Principal {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.setNome(coletarDados("Nome"));
        gerente.setCodigo(Integer.parseInt(coletarDados("Código")));
        gerente.setUsuario(coletarDados("Usuário"));
        gerente.setSenha(coletarDados("Senha"));
        gerente.setSalario(Double.parseDouble(coletarDados("Salário")));
        gerente.entrada();
        gerente.saida();

        Telefonista telefonista = new Telefonista();

        telefonista.setNome(coletarDados("Nome"));
        telefonista.setSalario(Double.parseDouble(coletarDados("Salário")));
        telefonista.setCodigo(Integer.parseInt(coletarDados("Código")));
        telefonista.entrada();
        telefonista.saida();
    }

    private static String coletarDados(String texto) {
        return JOptionPane.showInputDialog(null,texto);
    }
}
