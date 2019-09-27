package capitulo17_entrada_e_saida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream arquivo = new FileInputStream("arquivo.txt");
        Scanner scan = new Scanner(arquivo);
        FileOutputStream arquivo2 = new FileOutputStream("arquivo2.txt");
        PrintStream printStream = new PrintStream(arquivo2);

        while(scan.hasNextLine()){
            String linha = scan.nextLine() ;
            printStream.println(linha);
        }

    }
}
