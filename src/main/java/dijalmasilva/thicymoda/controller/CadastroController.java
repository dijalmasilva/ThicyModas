/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.controller;

import dijalmasilva.thicymoda.entidades.Cliente;
import dijalmasilva.thicymoda.entidades.Estoque;
import dijalmasilva.thicymoda.entidades.Fornecedor;
import dijalmasilva.thicymoda.entidades.Marca;
import dijalmasilva.thicymoda.entidades.Produto;
import dijalmasilva.thicymoda.entidades.Usuario;
import dijalmasilva.thicymoda.gerenciadores.GerenciaCliente;
import dijalmasilva.thicymoda.gerenciadores.GerenciaEstoque;
import dijalmasilva.thicymoda.gerenciadores.GerenciaFornecedor;
import dijalmasilva.thicymoda.gerenciadores.GerenciaMarca;
import dijalmasilva.thicymoda.gerenciadores.GerenciaUsuario;
import dijalmasilva.thicymoda.gerenciadores.GerenciaProduto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
public class CadastroController {
    
    @RequestMapping("addUsuario ")
    public String addUsuario(Usuario u) throws ClassNotFoundException{
        GerenciaUsuario gu = new GerenciaUsuario();
        gu.cadastraUsuario(u);
        return "novoUsuario";
    }
    
    @RequestMapping("addCliente")
    public String addCliente(Cliente c) throws ClassNotFoundException{
        GerenciaCliente gc = new GerenciaCliente();
        gc.addCliente(c);
        return "novoCliente";
    }
    
    @RequestMapping("addMarca")
    public String addMarca(Marca m) throws ClassNotFoundException{
        GerenciaMarca gm = new GerenciaMarca();
        gm.addMarca(m);
        
        return "novaMarca";
    }
    
    @RequestMapping("addFornecedor")
    public String addFornecedor(Fornecedor f) throws ClassNotFoundException{
        GerenciaFornecedor gf = new GerenciaFornecedor();
        gf.addFornecedor(f);
        
        return "novoFornecedor";
    }
    
    @RequestMapping("addProduto")
    public String addProduto(Produto p, String[] pecas) throws ClassNotFoundException{
        GerenciaProduto gp = new GerenciaProduto();
        gp.addProduto(p);
        cadastraNoEstoque(p.getCodigo(), pecas);
        return "novoProduto";
    }
    
    public void cadastraNoEstoque(int idProduto, String[] pecas) throws ClassNotFoundException{
        
        for (String peca : pecas) {
            String[] s = peca.split(", ");
            String tam = s[0];
            int qtde = Integer.parseInt(s[1]);
            Estoque e = new Estoque(idProduto, qtde, tam);
            GerenciaEstoque ge = new GerenciaEstoque();
            ge.addEstoque(e);
        }
        
    }
}