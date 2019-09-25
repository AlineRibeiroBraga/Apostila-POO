package capitulo9_polimosfismo;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {

    private String nome;
    private double salario;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void entrada(){

        SimpleDateFormat dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        Imprimir("Entrada: ",dataHora.format(agora));
    }

    private void Imprimir(String texto, String format) {
        JOptionPane.showMessageDialog(null,getNome()+"\n"+texto+format);
    }

    public void saida(){

        SimpleDateFormat dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        Imprimir("Saída: ",dataHora.format(agora));
    }
}
