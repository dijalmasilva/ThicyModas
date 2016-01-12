/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.fabricas;

import dijalmasilva.thicymoda.dao.ClienteDAOImpl;
import dijalmasilva.thicymoda.dao.EstoqueDAOImpl;
import dijalmasilva.thicymoda.dao.FornecedorDAOImpl;
import dijalmasilva.thicymoda.dao.ItemDeVendaDAOImpl;
import dijalmasilva.thicymoda.dao.MarcaDAOImpl;
import dijalmasilva.thicymoda.dao.ProdutoDAOImpl;
import dijalmasilva.thicymoda.dao.UsuarioDAOImpl;
import dijalmasilva.thicymoda.dao.VendaPrazoDAOImpl;
import dijalmasilva.thicymoda.dao.VendaVistaDAOImpl;
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
public class FactoryBDImpl implements FactoryBD{

    @Override
    public ClienteDAO clienteDAO() {
        return new ClienteDAOImpl();
    }

    @Override
    public EstoqueDAO estoqueDAO() {
        return new EstoqueDAOImpl();
    }

    @Override
    public FornecedorDAO fornecedorDAO() {
        return new FornecedorDAOImpl();
    }

    @Override
    public ItemDeVendaDAO itemDeVendaDAO() {
        return new ItemDeVendaDAOImpl();
    }

    @Override
    public MarcaDAO marcaDAO() {
        return new MarcaDAOImpl();
    }

    @Override
    public ProdutoDAO produtoDAO() {
        return new ProdutoDAOImpl();
    }

    @Override
    public UsuarioDAO usuarioDAO() {
        return new UsuarioDAOImpl();
    }

    @Override
    public VendaPrazoDAO vendaPrazoDAO() {
        return new VendaPrazoDAOImpl();
    }

    @Override
    public VendaVistaDAO vendaVistaDAO() {
        return new VendaVistaDAOImpl();
    }

}
