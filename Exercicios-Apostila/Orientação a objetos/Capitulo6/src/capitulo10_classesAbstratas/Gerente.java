package capitulo10_classesAbstratas;

import javax.swing.*;

public class Gerente extends Funcionario {

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

    @Override
    public void bonificação() {

        double sal = getSalario() *0.1;
        JOptionPane.showMessageDialog(null,"Bonificação R$"+sal);
    }
}
