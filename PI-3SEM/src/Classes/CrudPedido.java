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
public class CrudPedido {

    private Connection con = null;

    public CrudPedido() {

        con = ConexaoBanco.getConnection();

    }

    public boolean inserir(Retirar pedido) {

        String sql = "INSERT INTO pedido (data_pedido, hora_pedido, valor_total, pagamento, extra) VALUES (?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, pedido.getData());
            stmt.setTime(2, pedido.getHora());
            stmt.setDouble(3, pedido.getValor());
            stmt.setString(4, pedido.getPagamento());
            stmt.setString(5, "Nome: " + pedido.getNome() + " - Retirar as:" + pedido.getHoraRetirar());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            return false;
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }

    public boolean inserir(Local pedido) {

        String sql = "INSERT INTO pedido (data_pedido, hora_pedido, valor_total, pagamento, extra) VALUES (?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, pedido.getData());
            stmt.setTime(2, pedido.getHora());
            stmt.setDouble(3, pedido.getValor());
            stmt.setString(4, pedido.getPagamento());
            stmt.setString(5, "Senha: " + pedido.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            return false;
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }

    public boolean inserir(ItensPedido i) {

        String sql = "INSERT INTO item_pedido (id_pedido, id_produto, valor_Produto, adicional, valor_adicional) VALUES ((SELECT MAX(id) FROM pedido),?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, i.getIdProduto());
            stmt.setDouble(2, i.getValorProduto());
            stmt.setString(3, i.getAdicional());
            stmt.setDouble(4, i.getValorAdicional());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            return false;
        }

    }

    public List<Pedido> mostrar(String d1, String d2) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pedido> pedidos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pedido WHERE data_pedido LIKE ? OR id LIKE ?");
            stmt.setString(1, "%" + d1 + "%");
            stmt.setString(2, "%" + d2 + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Retirar pedido = new Retirar();

                pedido.setId(rs.getInt("id"));
                pedido.setNome(rs.getString("nome"));
                pedido.setValor(rs.getDouble("valor"));
                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }

        return pedidos;
    }
}
