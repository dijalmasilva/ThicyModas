/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.dao;

import dijalmasilva.thicymoda.conexoes.Conexao;
import dijalmasilva.thicymoda.entidades.Usuario;
import dijalmasilva.thicymoda.interfacesDao.UsuarioDAO;
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
public class UsuarioDAOImpl implements UsuarioDAO{
    
    @Override
    public List<Usuario> recuperaUsuarios() throws ClassNotFoundException{
        List<Usuario> usuarios = new ArrayList<>();
        
        Connection con = Conexao.abrirConexao();
        
        try {
            Statement stat = con.createStatement();
            String sql = "select * from usuario";
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()){
                Usuario u = new Usuario();
                u.setCpf(rs.getString("cpf"));
                u.setEmail(rs.getString("email"));
                u.setImagem(rs.getString("imagem"));
                u.setNomeCompleto(rs.getString("nomeCompleto"));
                u.setNomeDeUsuario(rs.getString("nomeDeUsuario"));
                u.setSenha(rs.getString("senha"));
                u.setSalario(rs.getDouble("salario"));
                u.setTelefone(rs.getString("telefone"));
                u.setTelefoneOpcional(rs.getString("telefoneOpcional"));
                u.setBairro(rs.getString("bairro"));
                u.setCidade(rs.getString("cidade"));
                u.setComplemento(rs.getString("complemento"));
                u.setEstado(rs.getString("estado"));
                u.setNumero(rs.getString("numero"));
                u.setRua(rs.getString("rua"));
                
                usuarios.add(u);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            Conexao.fecharConexao(con);
        }
        
        return usuarios;
    }
    
    @Override
    public boolean cadastraUsuario(Usuario u) throws ClassNotFoundException{
        
        Connection con = Conexao.abrirConexao();
        
        boolean result = false;
        
        String sql = "insert into usuario (imagem, nomeCompleto, cpf, telefone, email, rua, numero, bairro, cidade, estado, complemento,"
                + "nomedeusuario, senha, salario, telefoneopcional) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, md5(?), ?, ?)";
        try {
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, u.getImagem());
            stmt.setString(2, u.getNomeCompleto());
            stmt.setString(3, u.getCpf());
            stmt.setString(4, u.getTelefone());
            stmt.setString(5, u.getEmail());
            stmt.setString(6, u.getRua());
            stmt.setString(7, u.getNumero());
            stmt.setString(8, u.getBairro());
            stmt.setString(9, u.getCidade());
            stmt.setString(10, u.getEstado());
            stmt.setString(11, u.getComplemento());
            stmt.setString(12, u.getNomeDeUsuario());
            stmt.setString(13, u.getSenha());
            stmt.setDouble(14, u.getSalario());
            stmt.setString(15, u.getTelefoneOpcional());
            
            if (stmt.executeUpdate() > 0)
                result = true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return result;
    }

    @Override
    public boolean removeUsuario(Usuario u) throws ClassNotFoundException {
       
        return true;
    }

    @Override
    public Usuario login(String nome, String senha) throws ClassNotFoundException {
        
        Usuario u = null;
        Connection con = Conexao.abrirConexao();
        
        String sql = "select * from usuario where nomeDeUsuario like ? and senha like md5(?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                u = new Usuario();
                u.setBairro(rs.getString("bairro"));
                u.setCidade(rs.getString("cidade"));
                u.setComplemento(rs.getString("complemento"));
                u.setCpf(rs.getString("cpf"));
                u.setEmail(rs.getString("email"));
                u.setEstado(rs.getString("estado"));
                u.setImagem(rs.getString("imagem"));
                u.setNomeCompleto(rs.getString("nomeCompleto"));
                u.setNumero(rs.getString("numero"));
                u.setNomeDeUsuario(nome);
                u.setSenha(senha);
                u.setTelefone(rs.getString("telefone"));
                u.setTelefoneOpcional(rs.getString("telefoneOpcional"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            Conexao.fecharConexao(con);
        }
        
        return u;
    }
}
