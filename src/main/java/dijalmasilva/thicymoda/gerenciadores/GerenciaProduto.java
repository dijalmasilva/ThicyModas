/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.gerenciadores;

import dijalmasilva.thicymoda.entidades.Produto;
import dijalmasilva.thicymoda.fabricas.Factory;
import dijalmasilva.thicymoda.fabricas.FactoryBD;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaProduto {

    public boolean addProduto(Produto p) throws ClassNotFoundException{
        
        return false;
    }
    
    public List<Produto> listarProdutos() throws ClassNotFoundException{
        
        return null;
    }
    
    public List<String> listarCodigos() throws ClassNotFoundException{
        FactoryBD f = Factory.newFactoryBD();
        return f.produtoDAO().listarCodigosCadastrados();
    }
}
