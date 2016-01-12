/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.controller;

import dijalmasilva.thicymoda.entidades.Marca;
import dijalmasilva.thicymoda.gerenciadores.GerenciaMarca;
import dijalmasilva.thicymoda.gerenciadores.GerenciaUsuario;
import dijalmasilva.thicymoda.gerenciadores.GerenciaProduto;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
public class newAnything {
    
    @RequestMapping("novaVenda")
    public String novaVenda(){
        return "principal";
    }
    
    @RequestMapping("novoCliente")
    public String novoCliente(){
        return "novoCliente";
    }
    
    @RequestMapping("novoUsuario")
    public String novoUsuario(){
        return "novoUsuario";
    }
    
    @RequestMapping("novoProduto")
    public String novoProduto(HttpServletRequest req) throws ClassNotFoundException{
        GerenciaMarca gm = new GerenciaMarca();
        List<Marca> marcas = gm.retornaMarcas();
        if (marcas.isEmpty())
            marcas = null;
        req.setAttribute("marcas", marcas);
        GerenciaProduto gp = new GerenciaProduto();
        req.getSession().setAttribute("codigos", gp.listarCodigos());
        return "novoProduto";
    }
    
    @RequestMapping("novaMarca")
    public String novaMarca(){
        return "novaMarca";
    }
    
    @RequestMapping("novoFornecedor")
    public String novaFornecedor(HttpServletRequest req) throws ClassNotFoundException{
        GerenciaMarca gm = new GerenciaMarca();
        req.setAttribute("marcas", gm.retornaMarcas());
        return "novoFornecedor";
    }
    
    @RequestMapping("estoque")
    public String estoque(){
        return "estoque";
    }
    
    @RequestMapping("vendas")
    public String vendas(){
        return "vendas";
    }
}
