/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ruy_s
 */
public class ItensPedido {

    private int idPedido, idProduto;
    private double valorProduto, valorAdicional;
    private String adicional, nome;

    public ItensPedido() {
    }

    public ItensPedido(int idProduto, double valorProduto) {
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
    }

    public ItensPedido(double valorProduto, double valorAdicional, String adicional, String nome) {
        this.valorProduto = valorProduto;
        this.valorAdicional = valorAdicional;
        this.adicional = adicional;
        this.nome = nome;
    }

    public ItensPedido(int idProduto, double valorProduto, String nome) {
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
        this.nome = nome;
    }

    public ItensPedido(int idPedido, String nome) {
        this.idPedido = idPedido;
        this.nome = nome;
    }

    public ItensPedido(int idPedido, int idProduto, double valorProduto, double valorAdicional, String adicional) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
        this.valorAdicional = valorAdicional;
        this.adicional = adicional;
    }

    public ItensPedido(int idProduto, double valorProduto, double valorAdicional, String adicional) {
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
        this.valorAdicional = valorAdicional;
        this.adicional = adicional;
    }

    public ItensPedido(int idProduto, double valorProduto, double valorAdicional, String adicional, String nome) {
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
        this.valorAdicional = valorAdicional;
        this.adicional = adicional;
        this.nome = nome;
    }

    public ItensPedido(int idProduto, double valorAdicional, String adicional, String nome) {
        this.idProduto = idProduto;
        this.valorAdicional = valorAdicional;
        this.adicional = adicional;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public double valorTotal(ItensPedido x) {
        return x.getValorProduto() + getValorAdicional();
    }
}
