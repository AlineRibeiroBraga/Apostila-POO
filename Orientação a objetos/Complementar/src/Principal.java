import javax.swing.*;

import static java.lang.Double.*;

public class Principal {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        int menu;

        c1.setNumero(Integer.parseInt(Menu("Número da conta")));
        c1.setLimite(Integer.parseInt(Menu("Limite")));
        c1.setSaldo(Integer.parseInt(Menu("Saldo")));

        do {
            menu = Integer.parseInt(Menu("Manu\n1. Depositar\n2. Sacar\n3. Imprimir extrato\n4.Finalizar"));

            switch (menu) {
                case 1:
                    c1.Deposito(Double.parseDouble(Menu("Valor")));
                    JOptionPane.showMessageDialog(null, "Deposíto realizado com sucesso!");
                    break;
                case 2:
                    c1.Sacar(parseDouble(Menu("Valor:")));
                    break;
                case 3:
                    c1.Extrato();
                    break;
                case 4:   JOptionPane.showMessageDialog(null,"Encerrando...");
                default:
                    JOptionPane.showMessageDialog(null,"Número inválido\n");
            }
        }while(menu != 4);
    }

    private static String Menu(String texto){
        return JOptionPane.showInputDialog(null,texto);
    }
}
