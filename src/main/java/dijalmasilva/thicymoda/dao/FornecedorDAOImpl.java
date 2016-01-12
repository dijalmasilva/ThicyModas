/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.dao;

import dijalmasilva.thicymoda.conexoes.Conexao;
import dijalmasilva.thicymoda.entidades.Fornecedor;
import dijalmasilva.thicymoda.interfacesDao.FornecedorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class FornecedorDAOImpl implements FornecedorDAO {

    @Override
    public boolean addFornecedor(Fornecedor f) throws ClassNotFoundException {

        boolean r = false;

        String sql = "insert into fornecedor (nome, telefone, email, idMarca, rua, numero, bairro, cidade, estado, complemento) values (?,?,?,?,?,?,?,?,?,?)";

        Connection con = Conexao.abrirConexao();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getTelefone());
            ps.setString(3, f.getEmail());
            ps.setInt(4, f.getIdMarca());
            ps.setString(5, f.getRua());
            ps.setString(6, f.getNumero());
            ps.setString(7, f.getBairro());
            ps.setString(8, f.getCidade());
            ps.setString(9, f.getEstado());
            ps.setString(10, f.getComplemento());
            
            if(ps.executeUpdate() > 0){
                r = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexao.fecharConexao(con);
        }

        return r;
    }

    @Override
    public List<Fornecedor> listarFornecedores() throws ClassNotFoundException {
        
        List<Fornecedor> fornecedores = new ArrayList<>();
        
        String slq = "select * from fornecedor";
        
        Connection con = Conexao.abrirConexao();
        
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(slq);
            
            while(rs.next()){
                Fornecedor f = new Fornecedor();
                f.setNome(rs.getString("nome"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setIdMarca(rs.getInt("idMarca"));
                f.setRua(rs.getString("rua"));
                f.setNumero(rs.getString("numero"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setEstado(rs.getString("estado"));
                f.setComplemento(rs.getString("complemento"));
                
                fornecedores.add(f);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexao.fecharConexao(con);
        }
        
        return fornecedores;
    }

}
