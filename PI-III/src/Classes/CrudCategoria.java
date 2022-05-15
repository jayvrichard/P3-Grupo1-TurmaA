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
public class CrudCategoria {

    private Connection con = null;

    public CrudCategoria() {

        con = ConexaoBanco.getConnection();

    }

    public boolean inserir(Categoria categoria) {

        String sql = "INSERT INTO categoria (nome) VALUES (?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
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

    public List<Categoria> mostrar() {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Categoria> categorias = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM categoria");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Categoria categoria = new Categoria();

                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categorias.add(categoria);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }

        return categorias;
    }

    public boolean editar(Categoria categoria) {

        String sql = "UPDATE categoria SET nome = ? where id = ? ";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            stmt.setInt(2, categoria.getId());
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

    public boolean excluir(Categoria categoria) {

        String sql = "DELETE FROM categoria where id = ? ";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoria.getId());
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

    public List<Categoria> mostrarDesc(String desc) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Categoria> categorias = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE nome LIKE ? OR id LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            stmt.setString(2, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Categoria categoria = new Categoria();

                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categorias.add(categoria);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt, rs);
        }

        return categorias;
    }
}
