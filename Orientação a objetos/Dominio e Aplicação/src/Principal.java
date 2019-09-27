public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Aline");
        aluno1.setRG("12.345.678");
        aluno1.setData_de_Nascimento("05/10/2000");

        aluno2.setNome("Alice");
        aluno2.setRG("21.453.768");
        aluno2.setData_de_Nascimento("05/02/2003");

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getRG());
        System.out.println(aluno1.getData_de_Nascimento());

        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getRG());
        System.out.println(aluno2.getData_de_Nascimento());

        Funcionario f1 = new Funcionario();

        f1.setCargo("Faxineira");
        f1.setSalario(2500);

        Funcionario f2 = new Funcionario();

        f2.setCargo("Gerente");
        f2.setSalario(3600);

        System.out.println(f1.getCargo());
        System.out.println(f1.getSalario());
        System.out.println(f2.getCargo());
        System.out.println(f2.getSalario());

        Turma TA = new Turma();

        TA.setPeriodo("Matituno");
        TA.setSerie(4);
        TA.setSigla("SP");
        TA.setTipo_do_Ensino("Fundamental");

        Turma TB = new Turma();

        TB.setPeriodo("Verpestino");
        TB.setSerie(3);
        TB.setSigla("SC");
        TB.setTipo_do_Ensino("Médio");

        System.out.println( TA.getPeriodo());
        System.out.println(TA.getSerie());
        System.out.println(TA.getSigla());
        System.out.println(TA.getTipo_do_Ensino());
        System.out.println(TB.getPeriodo());
        System.out.println(TB.getSerie());
        System.out.println(TB.getSigla());
        System.out.println(TB.getTipo_do_Ensino());
    }
}
