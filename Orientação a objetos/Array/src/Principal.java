import javax.swing.*;
import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Média: "+Media());
        JOptionPane.showMessageDialog(null,"Maior número: "+maiorNumero());
    }

    private static double Media(){

        int []vetor = new int[10];
        double soma=0;

        for(int numero:vetor){
            soma += Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
            soma+= numero;
        }

        return soma/10;
    }

    private static double maiorNumero(){

        int []vetor = new int[10];

        for(int i=0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
        }

        return  IntStream.of(vetor).max().getAsInt();
    }
}
