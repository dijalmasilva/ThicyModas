/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.fabricas;

import dijalmasilva.thicymoda.interfacesDao.ClienteDAO;
import dijalmasilva.thicymoda.interfacesDao.EstoqueDAO;
import dijalmasilva.thicymoda.interfacesDao.FornecedorDAO;
import dijalmasilva.thicymoda.interfacesDao.ItemDeVendaDAO;
import dijalmasilva.thicymoda.interfacesDao.MarcaDAO;
import dijalmasilva.thicymoda.interfacesDao.ProdutoDAO;
import dijalmasilva.thicymoda.interfacesDao.UsuarioDAO;
import dijalmasilva.thicymoda.interfacesDao.VendaPrazoDAO;
import dijalmasilva.thicymoda.interfacesDao.VendaVistaDAO;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface FactoryBD {
    
    public ClienteDAO clienteDAO();
    
    public EstoqueDAO estoqueDAO();
    
    public FornecedorDAO fornecedorDAO();
    
    public ItemDeVendaDAO itemDeVendaDAO();
    
    public MarcaDAO marcaDAO();
    
    public ProdutoDAO produtoDAO();
    
    public UsuarioDAO usuarioDAO();
    
    public VendaPrazoDAO vendaPrazoDAO();
    
    public VendaVistaDAO vendaVistaDAO();
}
