public class Aluno {

    private String nome;
    private String RG;
    private String Data_de_Nascimento;

    public Turma getT1() {
        return t1;
    }

    public void setT1(Turma t1) {
        this.t1 = t1;
    }

    private Turma t1 = new Turma();

    public String getNome() {

        return nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getRG() {

        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getData_de_Nascimento() {

        return Data_de_Nascimento;
    }

    public void setData_de_Nascimento(String data_de_Nascimento) {

        Data_de_Nascimento = data_de_Nascimento;
    }
}
