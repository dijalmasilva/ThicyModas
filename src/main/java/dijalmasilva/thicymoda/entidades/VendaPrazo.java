/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.entidades;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class VendaPrazo extends Venda{
    
    private String nomeCliente;
    private String cpf;

    public VendaPrazo() {
    }

    public VendaPrazo(String nomeCliente, String cpf, double total, List<ItemDeVenda> itens, int qtdeParcelas, double entrada, LocalDate dataDaVenda) {
        super(total, itens, qtdeParcelas, entrada, dataDaVenda);
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}