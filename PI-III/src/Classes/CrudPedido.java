/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ruy_s
 */
public class CrudPedido {
     private Connection con = null;

    public CrudPedido() {

        con = ConexaoBanco.getConnection();

    }

public boolean inserir(Adicional adicional) {

        String sql = "INSERT INTO adicional (nome, valor) VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, adicional.getNome());
            stmt.setDouble(2, adicional.getValor());
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
}
