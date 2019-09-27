package capitulo8_heranca;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Gerente g = new Gerente();

        g.setNome(coletarDados("Nome do gerente"));
        g.setUsuario(coletarDados("Usuário"));
        g.setSenha(coletarDados("Senha"));
        g.setSalario(Double.parseDouble(coletarDados("Salário")));

        Telefonista t = new Telefonista();

        t.setNome(coletarDados("Nome da telefonista"));
        t.setSalario(Double.parseDouble(coletarDados("Salário")));
        t.setEstacaoDeTrabalho(Integer.parseInt(coletarDados("Estação de Trabalho")));

        Secretaria s = new Secretaria();

        s.setNome(coletarDados("Nome da secretária"));
        s.setSalario(Double.parseDouble(coletarDados("Salario")));
        s.setRamal(Integer.parseInt(coletarDados("Ramal")));

        imprimir(g.imprimirDados());
        imprimir(t.imprimirDados());
        imprimir(s.imprimirDados());
    }

    private static String coletarDados(String texto){
        return JOptionPane.showInputDialog(null,texto);
    }

    private static void imprimir(String texto) {
        JOptionPane.showMessageDialog(null,texto);
    }
}
