/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.interfacesDao;

import dijalmasilva.thicymoda.entidades.Fornecedor;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface FornecedorDAO {

    public boolean addFornecedor(Fornecedor f) throws ClassNotFoundException;
    
    public List<Fornecedor> listarFornecedores() throws ClassNotFoundException;
}
