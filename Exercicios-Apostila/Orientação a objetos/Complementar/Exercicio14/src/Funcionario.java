import javax.swing.*;

public class Funcionario {

    private String nome;
    private double salario = 200;

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
        if(salario >= 200){
            this.salario = salario;
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor inválido");
        }
    }
}
