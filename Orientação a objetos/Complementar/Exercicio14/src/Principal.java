import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome(Menu("Nome"));

        int menu;

        do{
            menu = Integer.parseInt(Menu("Menu\n1. Alterar nome\n" + "2. Alterar salário\n3. Visualizar dados\n4. Sair"));

            switch (menu){
                case 1: f1.setNome(Menu("Nome"));
                    break;
                case 2: f1.setSalario(Double.parseDouble(Menu("Salário")));
                    break;
                case 3: JOptionPane.showMessageDialog(null,"Nome: "+f1.getNome()+"\nSalário: R$"+
                                                                                                f1.getSalario());
                    break;
                case 4: Imprimir("Encerrando...");
                    break;
                default: Imprimir("Valor inválido");
            }
        }while(menu != 4);
    }

    public static String Menu(String texto){
        return JOptionPane.showInputDialog(null,texto);
    }

    public static void Imprimir(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
}
