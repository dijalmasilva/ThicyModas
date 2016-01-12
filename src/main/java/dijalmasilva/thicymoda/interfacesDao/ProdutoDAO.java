/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.interfacesDao;

import dijalmasilva.thicymoda.entidades.Produto;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface ProdutoDAO {

    public List<String> listarCodigosCadastrados() throws ClassNotFoundException;
    
    public boolean addProduto(Produto p) throws ClassNotFoundException;
    
    public List<Produto> listarProdutos() throws ClassNotFoundException;
}
