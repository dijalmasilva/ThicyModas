/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Conexao {

    private static Connection conn = null;

    public static Connection abrirConexao() throws ClassNotFoundException {
        return abrirConexaoBanco("jdbc:postgresql://localhost:5432/", "thicymoda", "postgres", "123");
    }

    public static Connection abrirConexaoBanco(String url, String dataBase, String user, String password) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try {
            conn = DriverManager.getConnection(url + dataBase, user, password);
        } catch (SQLException ex) {
            try {
                conn = DriverManager.getConnection(url, user, password);
                BancoDeDados.criaBancoDeDados(conn);
                conn = DriverManager.getConnection(url + dataBase, user, password);
                BancoDeDados.criaTabelas(conn);
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
        return conn;
    }

    public static void fecharConexao(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

}
