package capitulo12_pacotes.sistema;

public class Conta {

    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
