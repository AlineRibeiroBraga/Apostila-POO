package capitulo17_entrada_e_saida.exercicio2;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("teste3.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);
        String palavra;

        do{
            palavra = JOptionPane.showInputDialog("Digite");
            printStream.println(palavra);
            palavra = JOptionPane.showInputDialog(null,"Deseja continuar?");
        }while(palavra.toLowerCase().equals("s"));

    }
}
