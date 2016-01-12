/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.dao;

import dijalmasilva.thicymoda.conexoes.Conexao;
import dijalmasilva.thicymoda.entidades.Produto;
import dijalmasilva.thicymoda.interfacesDao.ProdutoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class ProdutoDAOImpl implements ProdutoDAO{

    @Override
    public List<String> listarCodigosCadastrados() throws ClassNotFoundException {
        
        List<String> codigos = new ArrayList<>();
        
        Connection con = Conexao.abrirConexao();
        
        String sql = "select codigo from produto";
        
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                codigos.add(rs.getString("codigo"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexao.fecharConexao(con);
        }
        
        return codigos;
    }

    @Override
    public boolean addProduto(Produto p) throws ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> listarProdutos() throws ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
