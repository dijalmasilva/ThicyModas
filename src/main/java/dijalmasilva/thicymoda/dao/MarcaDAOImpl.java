/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.dao;

import dijalmasilva.thicymoda.conexoes.Conexao;
import dijalmasilva.thicymoda.entidades.Marca;
import dijalmasilva.thicymoda.interfacesDao.MarcaDAO;
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
public class MarcaDAOImpl implements MarcaDAO {

    @Override
    public boolean addMarca(Marca m) throws ClassNotFoundException {

        boolean r = false;

        String sql = "insert into marca (nome, telefone, email, rua, numero, bairro, cidade, estado, complemento) values (?,?,?,?,?,?,?,?,?)";

        Connection con = Conexao.abrirConexao();

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getTelefone());
            stmt.setString(3, m.getEmail());
            stmt.setString(4, m.getRua());
            stmt.setString(5, m.getNumero());
            stmt.setString(6, m.getBairro());
            stmt.setString(7, m.getCidade());
            stmt.setString(8, m.getEstado());
            stmt.setString(9, m.getComplemento());

            if (stmt.executeUpdate() > 0) {
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
    public List<Marca> retornaMarcas() throws ClassNotFoundException {
        List<Marca> marcas = new ArrayList<>();

        String sql = "select * from marca";

        Connection con = Conexao.abrirConexao();

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                Marca m = new Marca();
                m.setId(rs.getInt("id"));
                m.setNome(rs.getString("nome"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));
                m.setRua(rs.getString("rua"));
                m.setNumero(rs.getString("numero"));
                m.setBairro(rs.getString("bairro"));
                m.setCidade(rs.getString("cidade"));
                m.setEstado(rs.getString("estado"));
                m.setComplemento(rs.getString("complemento"));

                marcas.add(m);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexao.fecharConexao(con);
        }

        return marcas;
    }

    @Override
    public int idPeloNome(String nome) throws ClassNotFoundException {

        int r = 0;

        String sql = "select id from marca where nome ilike ?";

        Connection con = Conexao.abrirConexao();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                r = rs.getInt("id");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexao.fecharConexao(con);
        }

        return r;
    }
}
