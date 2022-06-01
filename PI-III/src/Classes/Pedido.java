/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ruy_s
 */
public abstract class Pedido implements Status {

    private int id, status;
    private Date data;
    private Time hora;
    private Double valor;
    private String pagamento;

    public Pedido(int id, int status, Date data, Time hora, Double valor, String pagamento) {
        this.id = id;
        this.status = status;
        this.data = data;
        this.hora = hora;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public abstract String statusPedido(int status);

    @Override
    public String status() {
        return statusPedido(status);
    }
}
