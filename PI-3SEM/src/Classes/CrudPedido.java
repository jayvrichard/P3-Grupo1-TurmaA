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
            stmt = con.prepareStatement("SELECT * FROM pedido WHERE data_pedido  >= ? and  data_pedido <= ?");
            stmt.setString(1, d1);
            stmt.setString(2, d2);
            rs = stmt.executeQuery();
            while (rs.next()) {

                Retirar pedido = new Retirar();

                pedido.setId(rs.getInt("id"));
                pedido.setNome(rs.getString("extra"));
                pedido.setValor(rs.getDouble("valor_total"));
                pedido.setPagamento(rs.getString("pagamento"));
                pedido.setData(rs.getDate("data_pedido"));
                pedido.setHora(rs.getTime("hora_pedido"));
                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }

        return pedidos;
    }

    public List<ItensPedido> mostrarItem(int id) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null, stmt2 = null;
        ResultSet rs = null, rs2 = null;

        List<ItensPedido> i = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM item_pedido WHERE id_pedido = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {

                ItensPedido pedido = new ItensPedido();

                pedido.setValorProduto(rs.getDouble("valor_produto"));
                pedido.setAdicional(rs.getString("adicional"));
                pedido.setValorAdicional(rs.getDouble("valor_adicional"));

                stmt2 = con.prepareStatement("SELECT nome FROM produto WHERE id = ?");
                stmt2.setInt(1, rs.getInt("id_produto"));
                rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    pedido.setNome(rs2.getString("nome"));
                }
                i.add(pedido);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
            ConexaoBanco.closeConnection(con, stmt2);
        }

        return i;
    }
}
