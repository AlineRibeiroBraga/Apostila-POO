package capitulo8_heranca;

public class Secretaria extends Funcionario{

    private int ramal;

    public int getRamal(int ramal) {
        return this.ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public String imprimirDados(){
        return super.imprimirDados()+"\nRamal: "+ramal;
    }
}
