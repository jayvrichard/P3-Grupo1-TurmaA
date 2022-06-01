/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ruy_s
 */
public class CrudProduto {

    private Connection con = null;

    public CrudProduto() {

        con = ConexaoBanco.getConnection();

    }

    public boolean inserir(Produto produto) {

        String sql = "INSERT INTO produto (nome, valor, descricao, id_categoria, adicional) VALUES (?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            stmt.setInt(4, produto.getCategoria());
            stmt.setBoolean(5, produto.isAdicional());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            return false;
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }

    public List<Produto> mostrar() {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getInt("id_categoria"));
                produto.setValor(rs.getDouble("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setAdicional(rs.getBoolean("adicional"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }

        return produtos;
    }

    public boolean editar(Produto produto) {

        String sql = "UPDATE produto SET nome = ?, id_categoria = ?, valor = ?, descricao = ?, adicional = ?  where id = ? ";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getCategoria());
            stmt.setDouble(3, produto.getValor());
            stmt.setString(4, produto.getDescricao());
            stmt.setBoolean(5, produto.isAdicional());
            stmt.setInt(6, produto.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            return false;
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }

    public boolean excluir(Produto produto) {

        String sql = "DELETE FROM produto where id = ? ";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, produto.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            return false;
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }

    public List<Produto> mostrarDesc(String desc) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE nome LIKE ? OR id LIKE ? OR valor LIKE ? OR descricao LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            stmt.setString(2, "%" + desc + "%");
            stmt.setString(3, "%" + desc + "%");
            stmt.setString(4, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getInt("id_categoria"));
                produto.setValor(rs.getDouble("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setAdicional(rs.getBoolean("adicional"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

    public List<Produto> mostrarProd(int cat, int id, int idm) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE id_categoria = ? AND id >= ? AND id <= ?");
            stmt.setInt(1, cat);
            stmt.setInt(2, id);
            stmt.setInt(3, idm);
            rs = stmt.executeQuery();
            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getInt("id_categoria"));
                produto.setValor(rs.getDouble("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setAdicional(rs.getBoolean("adicional"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

    public List<Produto> mostrarItem(int id) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE id = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getInt("id_categoria"));
                produto.setValor(rs.getDouble("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setAdicional(rs.getBoolean("adicional"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt, rs);
        }

        return produtos;
    }
}
