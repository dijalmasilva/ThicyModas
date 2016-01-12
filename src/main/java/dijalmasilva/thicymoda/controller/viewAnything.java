/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.controller;

import dijalmasilva.thicymoda.entidades.Cliente;
import dijalmasilva.thicymoda.gerenciadores.GerenciaCliente;
import dijalmasilva.thicymoda.gerenciadores.GerenciaUsuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
public class viewAnything {
    
    @RequestMapping("usuarios")
    public String verUsuarios(HttpServletRequest req) throws ClassNotFoundException{
        GerenciaUsuario gu = new GerenciaUsuario();
        req.setAttribute("usuarios", gu.recuperaUsuarios());
        return "usuarios";
    }
    
    @RequestMapping("clientes")
    public String verClientes(HttpServletRequest req) throws ClassNotFoundException{
        GerenciaCliente gc = new GerenciaCliente();
        List<Cliente> clientes = gc.recuperaClientes();
        req.getSession().setAttribute("clientes", clientes);
        return "clientes";
    }
}
