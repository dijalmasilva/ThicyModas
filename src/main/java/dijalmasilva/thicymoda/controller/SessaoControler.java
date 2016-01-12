package dijalmasilva.thicymoda.controller;

import dijalmasilva.thicymoda.entidades.Usuario;
import dijalmasilva.thicymoda.gerenciadores.GerenciaUsuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
public class SessaoControler {
    
    @RequestMapping("verificaLogin")
    public String login(HttpServletRequest req, HttpServletResponse res, String nomeDeUsuario, String senha) throws ClassNotFoundException{
        GerenciaUsuario gu = new GerenciaUsuario();
        Usuario u = gu.login(nomeDeUsuario, senha);
        
        if (u == null){
            return erroAoLogar();
        }
        
        req.getSession().setAttribute("user", u);
        return logou();
    }
    
    public String logou() throws ClassNotFoundException{
        return "principal";
    }
    
    public String erroAoLogar(){
        return "erroLogin";
    }
    
    @RequestMapping("index")
    public String logout(HttpServletRequest req, HttpServletResponse res){
        
        req.getSession().invalidate();
        return "index";
    }
    
}
