/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.interfacesDao;

import dijalmasilva.thicymoda.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface UsuarioDAO {

    public List<Usuario> recuperaUsuarios() throws ClassNotFoundException;
    
    public boolean cadastraUsuario(Usuario u) throws ClassNotFoundException;
    
    public boolean removeUsuario(Usuario u) throws ClassNotFoundException;
    
    public Usuario login(String nomeDeUsuario, String senha) throws ClassNotFoundException;
}
