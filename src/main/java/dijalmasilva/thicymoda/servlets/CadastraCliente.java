/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.servlets;

import dijalmasilva.thicymoda.gerenciadores.GerenciaCliente;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class CadastraCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String nomeCompleto = req.getParameter("nomeCompleto");
        String cpf = req.getParameter("cpf");
        String telefone = req.getParameter("telefone");
        String email = req.getParameter("email");
        String profissao = req.getParameter("profissao");
        LocalDate aniversario = LocalDate.parse(req.getParameter("aniversario"));
        String rua = req.getParameter("rua");
        String numero = req.getParameter("numero");
        String bairro = req.getParameter("bairro");
        String cidade = req.getParameter("cidade");
        String estado = req.getParameter("estado");
        String complemento = req.getParameter("complemento");
        String telefoneOpcional = req.getParameter("telefoneOpcional");
        String[] dis = req.getParameterValues("disponibilidade");
        String disponibilidade = "";
        for(String d: dis){
            disponibilidade += d + ",";
        }
        
        double limite = Double.parseDouble(req.getParameter("limite"));
        String observacao = req.getParameter("observacao");
        
        GerenciaCliente gc = new GerenciaCliente();
        try {
            gc.cadastraCliente(nomeCompleto, cpf, telefone, email, profissao, aniversario, rua, numero, bairro, cidade, estado, complemento, telefoneOpcional, disponibilidade, limite, observacao);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        resp.sendRedirect("novoCliente");
    }

}
