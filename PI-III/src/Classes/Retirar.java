/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author ruy_s
 */
public class Retirar extends Pedido {

    private String nome;
    private Time horaRetirar;

    public Retirar() {
    }

    public Retirar(String nome, Time horaRetirar, int id, int status, Date data, Time hora, Double valor, String pagamento) {
        super(id, status, data, hora, valor, pagamento);
        this.nome = nome;
        this.horaRetirar = horaRetirar;
    }

    public Retirar(String nome, Time horaRetirar) {
        this.nome = nome;
        this.horaRetirar = horaRetirar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getHoraRetirar() {
        return horaRetirar;
    }

    public void setHoraRetirar(Time horaRetirar) {
        this.horaRetirar = horaRetirar;
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
            return "Entregue";
        } else if (status == 4) {
            return "Cancelado";
        }
        return null;
    }
;
}
