import javax.swing.*;

public class Conta {

    private int numero;
    private double limite;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Deposito(double saldo){

        if(limite < 0){
            limite += saldo;
        }
        else{
            this.saldo += saldo;
        }
    }

    public void Sacar( double valor) {
        JOptionPane.showMessageDialog(null,saldo);
        if(valor <= (saldo+ limite)){
                saldo -= valor;

        }else{
            JOptionPane.showMessageDialog(null,"Valor indisponível");
        }
        JOptionPane.showMessageDialog(null,saldo);
    }

    public void Extrato() {
        JOptionPane.showMessageDialog(null,"Número: "+numero+"\nSaldo: R$"+saldo+
                                                                            "\nLimite: "+limite);
    }
}
