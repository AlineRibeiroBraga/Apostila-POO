import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        boolean laco = true;
        Funcionario funcionario  = new Funcionario();

        while(laco){
            try {
                funcionario.aumentaSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor")));
                laco = false;

            }catch(IllegalArgumentException arg){
                JOptionPane.showMessageDialog(null,"Valor inválido");

            }
        }


    }
}
