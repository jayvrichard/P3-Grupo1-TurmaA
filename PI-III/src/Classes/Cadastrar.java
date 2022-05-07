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
public class Cadastrar {
    private Connection con = null;

    public Cadastrar() {
        
        con = ConexaoBanco.getConnection();
        
    }
    
    public boolean inserir(Produto produto){
        
        String sql = "INSERT INTO produto (nome, valor, descricao, categoria) VALUES (?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            stmt.setString(4, produto.getCategoria());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            return false;
        }finally{
        ConexaoBanco.closeConnection(con, stmt);
        }
    }
}
