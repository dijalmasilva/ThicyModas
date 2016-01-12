package dijalmasilva.thicymoda.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */


public class Cliente extends Pessoa{

    private double limite;
    private String profissao;
    private String observacao;
    private String disponibilidade;
    private LocalDate aniversario;

    public Cliente() {
    }

    public Cliente(double limite, String profissao, String observacao, String disponibilidade, LocalDate aniversario, String imagem, String nomeCompleto, String cpf, String telefone, String email, String rua, String numero, String bairro, String cidade, String estado, String complemento, String telefoneOpcional) {
        super(imagem, nomeCompleto, cpf, telefone, email, rua, numero, bairro, cidade, estado, complemento, telefoneOpcional);
        this.limite = limite;
        this.profissao = profissao;
        this.observacao = observacao;
        this.disponibilidade = disponibilidade;
        this.aniversario = aniversario;
    }
  

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public String getAniversarioFormatado(){
        return aniversario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

        
}
