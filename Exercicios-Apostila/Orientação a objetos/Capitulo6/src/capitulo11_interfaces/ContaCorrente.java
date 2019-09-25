package capitulo11_interfaces;

import javax.swing.*;

public class ContaCorrente implements Conta {

    private  double saldo;
    //private double taxa = 0.4;

    @Override
    public void Deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void Sacar(double valor) {
        if(valor <= saldo){
            this.saldo -=  valor;
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor inválido","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
