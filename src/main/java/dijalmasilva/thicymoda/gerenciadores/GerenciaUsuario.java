/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.gerenciadores;

import dijalmasilva.thicymoda.entidades.Usuario;
import dijalmasilva.thicymoda.fabricas.Factory;
import dijalmasilva.thicymoda.fabricas.FactoryBD;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaUsuario {

    public List<Usuario> recuperaUsuarios() throws ClassNotFoundException {
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.usuarioDAO().recuperaUsuarios();
    }

    public boolean cadastraUsuario(Usuario u) throws ClassNotFoundException {
        
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.usuarioDAO().cadastraUsuario(u);
    }
    
    public boolean removerUsuario(int id){
        
        return true;
    }
    
    public Usuario login(String nomeDeUsuario, String senha) throws ClassNotFoundException{
        
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.usuarioDAO().login(nomeDeUsuario, senha);
        
    }
    
    public boolean editarUsuario(int idUserAntigo, Usuario u){
     
        return true;
    }
    
    public boolean editarUsuario(String nome, Usuario u){
    
        return true;
    }
}
