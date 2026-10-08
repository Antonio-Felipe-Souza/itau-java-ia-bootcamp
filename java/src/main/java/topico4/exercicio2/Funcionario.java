package topico4.exercicio2;

public class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private boolean isAdm;

    public void realizarLogin(){
        System.out.println("Realizando login...");
    }

    public void realizarLogoff(){
        System.out.println("Realizando logoff...");
    }

    public void alterarDados(){
        System.out.println("Alterando dados...");
    }

    public void alterarSenha(){
        System.out.println("Alterando senha...");
    }


    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return isAdm;
    }

    public void setAdm(boolean adm) {
        isAdm = adm;
    }
}