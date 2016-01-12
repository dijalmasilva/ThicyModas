/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.dao;

import dijalmasilva.thicymoda.conexoes.Conexao;
import dijalmasilva.thicymoda.entidades.Cliente;
import dijalmasilva.thicymoda.interfacesDao.ClienteDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class ClienteDAOImpl implements ClienteDAO {

    @Override
    public boolean cadastra(Cliente c) throws ClassNotFoundException {

        boolean result = false;

        Connection con = Conexao.abrirConexao();
        String sql = "insert into Cliente (imagem, nomeCompleto, cpf, telefone, email, rua, numero, bairro, cidade, estado,"
                + " complemento, telefoneOpcional, limite, profissao, observacao, disponibilidade, aniversario) values ("
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getImagem());
            stmt.setString(2, c.getNomeCompleto());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEmail());
            stmt.setString(6, c.getRua());
            stmt.setString(7, c.getNumero());
            stmt.setString(8, c.getBairro());
            stmt.setString(9, c.getCidade());
            stmt.setString(10, c.getEstado());
            stmt.setString(11, c.getComplemento());
            stmt.setString(12, c.getTelefoneOpcional());
            stmt.setDouble(13, c.getLimite());
            stmt.setString(14, c.getProfissao());
            stmt.setString(15, c.getObservacao());
            stmt.setString(16, c.getDisponibilidade());
            stmt.setDate(17, Date.valueOf(c.getAniversario()));

            if (stmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexao.fecharConexao(con);
        }

        return result;

    }

    @Override
    public List<Cliente> listarClientes() throws ClassNotFoundException {
        
        List<Cliente> clientes = new ArrayList<>();
        
        String sql = "select * from cliente";
        
        Connection con = Conexao.abrirConexao();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setProfissao(rs.getString("profissao"));
                c.setAniversario(rs.getDate("aniversario").toLocalDate());
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setComplemento(rs.getString("complemento"));
                c.setCpf(rs.getString("cpf"));
                c.setDisponibilidade(rs.getString("disponibilidade"));
                c.setEmail(rs.getString("email"));
                c.setEstado(rs.getString("estado"));
                c.setImagem(rs.getString("imagem"));
                c.setLimite(rs.getDouble("limite"));
                c.setNomeCompleto(rs.getString("nomeCompleto"));
                c.setNumero(rs.getString("numero"));
                c.setObservacao(rs.getString("observacao"));
                c.setRua(rs.getString("rua"));
                c.setTelefone(rs.getString("telefone"));
                c.setTelefoneOpcional(rs.getString("telefoneOpcional"));
                
                clientes.add(c);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexao.fecharConexao(con);
        }
        
        return clientes;
    }

}
