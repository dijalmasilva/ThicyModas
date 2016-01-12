/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.gerenciadores;

import dijalmasilva.thicymoda.entidades.Cliente;
import dijalmasilva.thicymoda.fabricas.Factory;
import dijalmasilva.thicymoda.fabricas.FactoryBD;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaCliente {

    public List<Cliente> recuperaClientes() throws ClassNotFoundException {
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.clienteDAO().listarClientes();
    }

    public boolean cadastraCliente(String nomeCompleto, String cpf, String telefone, String email, String profissao,
            LocalDate aniversario, String rua, String numero, String bairro, String cidade, String estado, String complemento,
            String telefoneOpcional, String disponibilidade, double limite, String observacao) throws ClassNotFoundException {

        Cliente c = new Cliente(limite, profissao, observacao, disponibilidade, aniversario, cidade, nomeCompleto, cpf, telefone, 
                email, rua, numero, bairro, cidade, estado, complemento, telefoneOpcional);
        
        FactoryBD fabrica = Factory.newFactoryBD();
        
        return fabrica.clienteDAO().cadastra(c);
    }

    public boolean addCliente(Cliente c) throws ClassNotFoundException{
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.clienteDAO().cadastra(c);
    }
    
    public boolean removerCliente(int id) {

        return true;
    }

    public boolean editarCliente(int idUserAntigo, Cliente c) {

        return true;
    }

    public boolean editarCliente(String nome, Cliente c) {

        return true;
    }
}
