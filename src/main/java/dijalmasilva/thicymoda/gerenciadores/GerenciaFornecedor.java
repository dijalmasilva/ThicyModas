/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.gerenciadores;

import dijalmasilva.thicymoda.entidades.Fornecedor;
import dijalmasilva.thicymoda.fabricas.Factory;
import dijalmasilva.thicymoda.fabricas.FactoryBD;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaFornecedor {

    public boolean addFornecedor(Fornecedor f) throws ClassNotFoundException {
        FactoryBD fabrica = Factory.newFactoryBD();
        GerenciaMarca gm = new GerenciaMarca();
        f.setIdMarca(gm.idPeloNome(f.getMarcaRepresentada()));
        return fabrica.fornecedorDAO().addFornecedor(f);
    }

    public List<Fornecedor> listarFornecedores() throws ClassNotFoundException {
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.fornecedorDAO().listarFornecedores();
    }

}
