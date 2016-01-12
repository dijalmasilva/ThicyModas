package dijalmasilva.thicymoda.entidades;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */

public class Usuario extends Pessoa {
    

    private String nomeDeUsuario;
    private String senha;
    private double salario;

    public Usuario() {
    }

    public Usuario(String nomeDeUsuario, String senha, double salario, String imagem, String nomeCompleto, String cpf, String telefone, String email, String rua, String numero, String bairro, String cidade, String estado, String complemento, String telefoneOpcional) {
        super(imagem, nomeCompleto, cpf, telefone, email, rua, numero, bairro, cidade, estado, complemento, telefoneOpcional);
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.salario = salario;
    }


    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
