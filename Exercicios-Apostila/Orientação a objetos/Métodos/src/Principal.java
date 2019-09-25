public class Principal {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Aline Ribeiro");
        f1.setSalario(2500);

        f1.aumento(500);

        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
    }

}
