/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.interfacesDao;

import dijalmasilva.thicymoda.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface ClienteDAO {

    public boolean cadastra(Cliente c) throws ClassNotFoundException;
    
    public List<Cliente> listarClientes () throws ClassNotFoundException;
}