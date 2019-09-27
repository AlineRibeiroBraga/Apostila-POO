package capitulo8_heranca;

public class Gerente extends Funcionario{

    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String imprimirDados(){
        return super.imprimirDados()+"\nUsuário: "+usuario+"\nSenha: "+senha;
    }

}
