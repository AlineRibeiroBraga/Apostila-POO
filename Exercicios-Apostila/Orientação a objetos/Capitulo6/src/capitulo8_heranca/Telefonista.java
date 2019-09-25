package capitulo8_heranca;

public class Telefonista extends Funcionario{

    private int estacaoDeTrabalho;

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    public String imprimirDados(){
        return super.imprimirDados()+"\nEstação de Trabalho: "+estacaoDeTrabalho;
    }
}
