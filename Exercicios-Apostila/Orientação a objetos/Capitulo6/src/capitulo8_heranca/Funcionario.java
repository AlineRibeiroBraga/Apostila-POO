package capitulo8_heranca;

public class Funcionario {

    private String nome;
    private double salario;
    private double bonitifcação;

    public String getNome(String nome_da_secretária) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario(double salario) {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonitifcação() {
        return bonitifcação;
    }

    public void setBonitifcação(double bonitifcação) {
        this.bonitifcação = bonitifcação;
    }

    public String imprimirDados(){
        return "Nome: "+nome+"\nSalário: R$"+salario+"\nBonitificação: R$ "+Bonitificacao();
    }

    public double Bonitificacao(){
            return bonitifcação = salario*0.1;
    }
}
