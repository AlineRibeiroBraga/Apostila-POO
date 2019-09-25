package atributos_e_metodos_de_classe;

public class Funcionario {

    private static double valeRefeicao = 15;

    public static double getValeRefeicao() {
        return valeRefeicao;
    }

    public static void reajusteTaxa(double taxa){

        if(taxa > 0){
            valeRefeicao += valeRefeicao*(taxa/100);
        }
        else{
            valeRefeicao -= valeRefeicao*(taxa/100);
        }
    }
}
