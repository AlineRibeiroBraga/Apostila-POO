public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Aline");
        aluno1.setRG("12.345.678");
        aluno1.setData_de_Nascimento("05/10/2000");

        Turma TA = new Turma();

        TA.setPeriodo("Matituno");
        TA.setSerie(4);
        TA.setSigla("SP");
        TA.setTipo_do_Ensino("Fundamental");

        aluno1.setT1(TA);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getRG());
        System.out.println(aluno1.getData_de_Nascimento());
        System.out.println(aluno1.getT1().getPeriodo());
        System.out.println(aluno1.getT1().getSerie());
        System.out.println(aluno1.getT1().getSigla());
        System.out.println(aluno1.getT1().getTipo_do_Ensino());
    }
}
