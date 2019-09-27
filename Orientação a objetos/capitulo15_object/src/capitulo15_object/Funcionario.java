package capitulo15_object;

import java.util.Objects;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        if(nome != null){
            this.nome = nome;
        }

        if(salario > 0){
            this.salario = salario;
        }
    }

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

    @Override
    public String toString() {
        return "Nome: "+nome+"\nSalário: R$"+salario;
    }
}
