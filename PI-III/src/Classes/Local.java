/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author ruy_s
 */
public class Local extends Pedido {

    private int senha;

    public Local() {
    }

    public Local(int senha, int id, int status, Date data, Time hora, Double valor, String pagamento) {
        super(id, status, data, hora, valor, pagamento);
        this.senha = senha;
    }

    public Local(int senha) {
        this.senha = senha;
    }

    

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String statusPedido(int status) {
        if (status == 0) {
            return "Confirmado";
        } else if (status == 1) {
            return "Em Preparo";
        } else if (status == 2) {
            return "Pronto";
        } else if (status == 3) {
            return "Cancelado";
        }
        return null;
    }
;
}
